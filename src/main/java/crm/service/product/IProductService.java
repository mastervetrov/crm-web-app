package crm.service.product;

import crm.dto.product.response.ProductDto;
import crm.dto.product.request.ProductUpsertRequest;
import crm.exception.product.ProductEntityNotFoundException;
import crm.mapper.product.ProductMapper;
import crm.model.product.Product;
import crm.repository.product.ProductRepository;
import crm.repository.product.ProductRepositoryCustom;
import crm.utils.ProductPaginationUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class IProductService implements ProductService<ProductDto>{

    private final ProductPaginationUtils productPaginationUtils;
    private final ProductRepositoryCustom productRepositoryCustom;
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Page<ProductDto> findAll(Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Product> productPage = productRepository.findAll(pageable);
        log.info("содержит тестовые данные" + productPage.getContent().toString() + "count: " + productRepository.count());
        Page<ProductDto> productDtoPage = productMapper.productPageToProductDtoPage(productPage);
        return productDtoPage;
    }

    @Override
    public Page<ProductDto> findAllByFields(List<String> fields, Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Map<String, Object>> pageData = productRepositoryCustom.getProductsByFieldsCustom(fields, pageable);
        Page<ProductDto> productDtoPage = productPaginationUtils.convertToPageProductDto(pageData);
        return productDtoPage;
    }

    @Override
    public ProductDto findById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> {throw new ProductEntityNotFoundException("Product with id " + id + " not found");});
        ProductDto productDto = productMapper.productToProductDto(product);
        return productDto;
    }

    @Override
    public ProductDto save(ProductUpsertRequest request) {
        Product productPreSave = productMapper.productRequestToProduct(request);
        log.info("Проверка перед сохранением: " + productPreSave.toString());
        Product product = productRepository.save(productPreSave);
        return productMapper.productToProductDto(product);
    }

    @Override
    public ProductDto updateById(Long id, ProductUpsertRequest request) {

        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductEntityNotFoundException("Product with id " + id + " not found"));

        // Обновляем поля только при необходимости
        boolean isModified = false;


        productRepository.findById(id).orElseThrow(() -> {throw new ProductEntityNotFoundException("Product with id " + id + " not found");});
        Product productUpdated = productRepository.save(productMapper.productRequestToProduct(id, request));
        return productMapper.productToProductDto(productUpdated);
    }

    @Override
    public void deleteById(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductEntityNotFoundException("Product with id " + id + " not found");
        }
        productRepository.deleteById(id);
    }
}

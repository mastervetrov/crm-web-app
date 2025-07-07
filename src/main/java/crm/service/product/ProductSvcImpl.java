package crm.service.product;

import crm.dto.product.ProductDto;
import crm.exception.product.ProductEntityNotFoundException;
import crm.mapper.product.ProductMapper;
import crm.model.product.Product;
import crm.repository.product.ProductRepository;
import crm.repository.product.ProductRepositoryCustom;
import crm.request.product.ProductUpsertRequest;
import crm.utils.ProductPaginationUtils;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * User settings CRUD service.
 * todo дополнить
 *
 * @see Product
 * @see ProductDto
 * @see ProductMapper
 * @see ProductRepository
 * @see ProductUpsertRequest
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductSvcImpl implements ProductSvc<ProductDto> {

  private final ProductPaginationUtils productPaginationUtils;
  private final ProductRepositoryCustom productRepositoryCustom;
  private final ProductRepository productRepository;
  private final ProductMapper productMapper;

  @Override
  public Page<ProductDto> findAll(Integer pageNumber, Integer pageSize) {
    Pageable pageable = PageRequest.of(pageNumber, pageSize);
    Page<Product> productPage = productRepository.findAll(pageable);
    Page<ProductDto> productDtoPage = productMapper.productPageToProductDtoPage(productPage);
    return productDtoPage;
  }

  @Override
  public Page<ProductDto> findAllByFields(List<String> fields, Integer number, Integer size) {
    Pageable pageable = PageRequest.of(number, size);
    Page<Map<String, Object>> pageData = productRepositoryCustom.findProducts(fields, pageable);
    Page<ProductDto> productDtoPage = productPaginationUtils.convertToPageProductDto(pageData);
    return productDtoPage;
  }

  @Override
  public ProductDto findById(Long id) {
    Product product = productRepository.findById(id).orElseThrow(() -> {
      throw new ProductEntityNotFoundException("Product with id " + id + " not found"); });
    ProductDto productDto = productMapper.productToProductDto(product);
    return productDto;
  }

  @Override
  public ProductDto save(ProductUpsertRequest request) {
    Product productPreSave = productMapper.requestToEntity(request);
    log.info("Проверка перед сохранением: " + productPreSave.toString());
    Product product = productRepository.save(productPreSave);
    return productMapper.productToProductDto(product);
  }

  @Override
  public ProductDto updateById(Long id, ProductUpsertRequest request) {
    String errorMessage = "Product with id " + id + " not found";
    Product existingProduct = productRepository.findById(id)
          .orElseThrow(() -> new ProductEntityNotFoundException(errorMessage));
    // Обновляем поля только при необходимости
    boolean isModified = false;
    productRepository.findById(id).orElseThrow(() -> {
      throw new ProductEntityNotFoundException("Product with id " + id + " not found"); });
    Product productUpdated = productRepository.save(productMapper.requestToEntity(id, request));
    return productMapper.productToProductDto(productUpdated);
  }

  @Override
  public void deleteById(Long id) {
    String errorMessage = "Product with id " + id + " not found";
    if (!productRepository.existsById(id)) {
      throw new ProductEntityNotFoundException(errorMessage);
    }
    productRepository.deleteById(id);
  }
}

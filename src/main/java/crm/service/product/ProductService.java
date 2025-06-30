package crm.service.product;

import crm.dto.product.request.ProductUpsertRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService<ProductDto> {
    Page<ProductDto> findAll(Integer pageNumber, Integer pageSize);

    Page<ProductDto> findAllByFields(List<String> fields, Integer pageNumber, Integer pageSize);

    ProductDto findById(Long id);

    ProductDto save(ProductUpsertRequest request);

    ProductDto updateById(Long id, ProductUpsertRequest request);

    void deleteById(Long id);
}

package crm.service.product;

import crm.dto.product.ProductDto;
import crm.mapper.product.ProductMapper;
import crm.model.product.Product;
import crm.repository.product.ProductRepository;
import crm.repository.product.ProductRepositoryCustom;
import crm.request.product.ProductRequest;
import crm.service.CrudService;
import crm.utils.ProductPaginationUtils;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @see ProductRequest
 */
@Service
@Slf4j
public class ProductService extends CrudService<
        ProductRequest,
        Product,
        ProductDto,
        ProductMapper,
        ProductRepository> {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link ProductMapper}
   * @param repository repository {@link ProductRepository}
   */
  public ProductService(ProductMapper mapper, ProductRepository repository) {
    super(mapper, repository);
  }

  @Autowired
  private ProductPaginationUtils productPaginationUtils;
  @Autowired
  private ProductRepositoryCustom productRepositoryCustom;

  /**
   * Finds all Product entities and maps them to ProductDto objects.
   * The result is returned as a paginated {@link Page} of {@link crm.dto.product.ProductDto}.
   * The result contains only specified fields.
   * todo дополнить doc
   *
   * @param fields specified fields.
   * @param number the page number to retrieve (0-based).
   * @param size the number of items per page.
   * @return a {@link Page} containing {@link crm.dto.product.ProductDto} objects
   */
  public Page<ProductDto> findAllByFields(List<String> fields, Integer number, Integer size) {
    Pageable pageable = PageRequest.of(number, size);
    Page<Map<String, Object>> pageData = productRepositoryCustom.findProducts(fields, pageable);
    Page<ProductDto> productDtoPage = productPaginationUtils.convertToPageProductDto(pageData);
    return productDtoPage;
  }

  @Override
  protected Long getEntityId(Product entity) {
    return entity.getId();
  }
}

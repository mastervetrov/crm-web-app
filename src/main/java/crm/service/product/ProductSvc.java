package crm.service.product;

import crm.request.product.ProductUpsertRequest;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
* Interface - CRUD service for operations with entities Product.
*
* @see crm.repository.product.ProductRepository
* @see crm.model.product.Product
* @see crm.mapper.product.ProductMapper
* @see ProductUpsertRequest
* @see crm.dto.product.ProductDto
* @param <ProductDtoT> {@link crm.dto.product.ProductDto}
*/
@Service
public interface ProductSvc<ProductDtoT> {

  /**
  * Finds all Product entities and maps them to ProductDto objects.
  * The result is returned as a paginated {@link Page} of {@link crm.dto.product.ProductDto}.
  *
  * @param pageNumber the page number to retrieve (0-based).
  * @param pageSize the number of items per page.
  * @return a {@link Page} containing {@link crm.dto.product.ProductDto} objects
  */
  Page<ProductDtoT> findAll(Integer pageNumber, Integer pageSize);

  /**
   * Finds all Product entities and maps them to ProductDto objects.
   * The result is returned as a paginated {@link Page} of {@link crm.dto.product.ProductDto}.
   * The result contains only specified fields.
   * todo дополнить doc
   *
   * @param fields specified fields.
   * @param pageNumber the page number to retrieve (0-based).
   * @param pageSize the number of items per page.
   * @return a {@link Page} containing {@link crm.dto.product.ProductDto} objects
   */
  Page<ProductDtoT> findAllByFields(List<String> fields, Integer pageNumber, Integer pageSize);

  /**
  * Method find Product entity by id and maps it to ProductDto object.
  * The result is returned as dto instance {@link crm.dto.product.ProductDto}.
  *
  * @param id target identifier
  * @return {@link crm.dto.product.ProductDto}
  */
  ProductDtoT findById(Long id);

  /**
  * Maps request to entity and save in {@link crm.repository.product.ProductRepository}.
  * The result entity is returned as dto instance {@link crm.dto.product.ProductDto}.
  *
  * @param request {@link ProductUpsertRequest}
  * @return {@link crm.dto.product.ProductDto}
  */
  ProductDtoT save(ProductUpsertRequest request);

  /**
  * Find entity by id and get from the {@link crm.repository.product.ProductRepository}.
  * The result entity is compared with request, after mapping.
  * If at least one field is different, an update occurs.
  * The output is updated entity in the form dto.
  *
  * @param id target identifier
  * @param request {@link ProductUpsertRequest}
  * @return {@link crm.dto.product.ProductDto}
  */
  ProductDtoT updateById(Long id, ProductUpsertRequest request);

  /**
  * Method for deleting entity by id.
  *
  * @param id target identifier.
  */
  void deleteById(Long id);
}

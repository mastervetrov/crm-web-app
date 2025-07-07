package crm.repository.product;

import crm.service.product.ProductSvc;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * RepositoryCustom interface for Product.
 * Used for customized returns Product fields.
 * Contains method for receiving pages Product.
 * The fields received contains only the requesting fields.
 * The idea of this class:
 * allow the user to customize the table Product that is displayed in the frontend.
 *
 * @see ProductRepositoryCustomImpl
 * @see crm.controller.thymeleaf.html.store.remainder.RemainderController
 * @see crm.controller.thymeleaf.ajax.store.remainder.RemainderAjaxController
 * @see ProductSvc
 * @see crm.model.product.Product
 */
@Repository
public interface ProductRepositoryCustom {
  /**
   * Method for receive product list {@link crm.model.product.Product} in form map list products.
   * Method accepts list target fields.
   * Task: getting products with only target fields.
   *
   * @param fields list target fields.
   * @param pageable pagination object.
   * @return page maps products.
   */
  Page<Map<String, Object>> findProducts(List<String> fields, Pageable pageable);
}

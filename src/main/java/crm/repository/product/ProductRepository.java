package crm.repository.product;

import crm.model.product.Product;
import crm.service.product.ProductSvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Product entity.
 *
 * @see Product
 * @see ProductSvc
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

package crm.request.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * Request - contains product data.
 * Used for update and save products.
 *
 * @see Productservice
 * @see crm.model.product.Product
 */
@Data
public class ProductRequest {
  private String name;
  private String description;
  private BigDecimal retailPrice;
  private BigDecimal dealerPrice;
  private BigDecimal partnerPrice;
  private Integer count;
  private boolean isNew;
  private boolean isHit;
  private String picture;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  //  private ReviewsList reviews;
  //  private Category category;
}

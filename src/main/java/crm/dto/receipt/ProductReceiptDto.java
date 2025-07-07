package crm.dto.receipt;

import java.math.BigDecimal;
import lombok.Data;

/**
 * DTO response - contains data products receipt.
 * Used for return in controllers.
 *
 * @see crm.model.receipt.Receipt
 * @see ReceiptDto
 */
@Data
public class ProductReceiptDto {

  private Long id;
  private Long code;
  private String name;
  private Integer newCount;
  private BigDecimal purchasePrice;
  private BigDecimal purchasePriceResult;
  private BigDecimal retailPrice;
  private BigDecimal dealerPrice;
  private BigDecimal partnerPrice;
  private boolean isNew;
  private boolean isHit;
  private String picture;
  private String category;
  private String createdAt;
  private String updatedAt;
  private String description;

}

package crm.model.receipt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 * Entity receipt item.
 * Contains receipt item data.
 * todo дополнить
 */
@Entity
@Table(name = "receipt_item")
public class ReceiptItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  private Receipt receipt;

  @Column(name = "quantity")
  private Integer quantity;

  @Column(name = "unit_price")
  private BigDecimal unitPrice;

  //  private Product product;
}

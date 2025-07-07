package crm.model.receipt;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity receipt.
 * Contains receipt data.
 *
 * @see crm.service.receipt.ReceiptSvc
 * @see crm.repository.ReceiptRepository
 * @see crm.mapper.receipt.ReceiptMapper
 * @see crm.request.receipt.ReceiptUpsertRequest
 * @see crm.dto.receipt.ReceiptDto
 */
@Entity
@Table(name = "receipt")
public class Receipt {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "invoice_number")
  private String invoiceNumber;

  @Column(name = "payment_status")
  private String paymentStatus;
  @Column(name = "name")
  private String name;

  @Column(name = "receipt_date_time")
  private LocalDateTime receiptDateTime;

  @Column(name = "totalSum")
  private BigDecimal totalSum;

  @Column(name = "paid")
  private BigDecimal paid;

  @Column(name = "comments")
  private String comments;


//  private List<MoneyTransaction> moneyTransactionList;
//  private Location location;
//  private Store store;
//  private Provider provider;
//  private List<ReceiptItem> items;

}

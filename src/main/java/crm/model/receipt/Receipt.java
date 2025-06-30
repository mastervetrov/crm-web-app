package crm.model.receipt;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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


//    private List<MoneyTransaction> moneyTransactionList;
//    private Location location;
//    private Store store;
//    private Provider provider;
//    private List<ReceiptItem> items;

}

package crm.model.receipt;

import jakarta.persistence.*;

import java.math.BigDecimal;

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

    //    private Product product;
}

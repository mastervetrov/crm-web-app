package crm.repository;

import crm.model.receipt.Receipt;
import crm.service.receipt.ReceiptSvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for ReceiptEntity.
 *
 * @see Receipt
 * @see ReceiptSvc
 */
@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}

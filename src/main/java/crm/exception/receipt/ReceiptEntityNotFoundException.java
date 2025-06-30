package crm.exception.receipt;

import jakarta.persistence.EntityNotFoundException;

public class ReceiptEntityNotFoundException extends EntityNotFoundException {
    public ReceiptEntityNotFoundException(String message) {
        super(message);
    }
}

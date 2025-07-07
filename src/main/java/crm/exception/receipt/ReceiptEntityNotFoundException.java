package crm.exception.receipt;

import jakarta.persistence.EntityNotFoundException;

/**
* This exception occurs, if {@link crm.model.receipt.Receipt} not found.
*/
public class ReceiptEntityNotFoundException extends EntityNotFoundException {
  /**
  * Error message.
  *
  * @param message text error message.
  */
  public ReceiptEntityNotFoundException(String message) {
    super(message);
  }
}

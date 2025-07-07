package crm.exception.product;

import jakarta.persistence.EntityNotFoundException;

/**
* Exception occurs if {@link crm.model.product.Product} not found.
*/
public class ProductEntityNotFoundException extends EntityNotFoundException {
  /**
  * Error message.
  *
  * @param message text error message.
  */
  public ProductEntityNotFoundException(String message) {
    super(message);
  }

}

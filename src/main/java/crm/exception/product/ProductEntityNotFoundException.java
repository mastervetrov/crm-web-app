package crm.exception.product;

import jakarta.persistence.EntityNotFoundException;

public class ProductEntityNotFoundException extends EntityNotFoundException {
    public ProductEntityNotFoundException(String message) {
        super(message);
    }

}

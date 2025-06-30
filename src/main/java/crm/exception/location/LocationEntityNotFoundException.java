package crm.exception.location;

import jakarta.persistence.EntityNotFoundException;

public class LocationEntityNotFoundException extends EntityNotFoundException {
    public LocationEntityNotFoundException(String message) {
        super(message);
    }
}

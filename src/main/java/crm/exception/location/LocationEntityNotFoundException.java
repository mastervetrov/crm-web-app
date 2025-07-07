package crm.exception.location;

import jakarta.persistence.EntityNotFoundException;

/**
* Exception occurs if {@link crm.model.location.Location} not found.
*/
public class LocationEntityNotFoundException extends EntityNotFoundException {
  /**
  * Error message.
  *
  * @param message text error message.,
  */
  public LocationEntityNotFoundException(String message) {
    super(message);
  }
}

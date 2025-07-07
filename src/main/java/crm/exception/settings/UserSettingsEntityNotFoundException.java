package crm.exception.settings;

import jakarta.persistence.EntityNotFoundException;

/**
* Exception occurs, if {@link crm.model.settings.UserSettings} not found.
*
* @see crm.service.settings.UserSettingsService
*/
public class UserSettingsEntityNotFoundException extends EntityNotFoundException {
  /**
  * Error message.
  *
  * @param message text error message
  */
  public UserSettingsEntityNotFoundException(String message) {
    super(message);
  }
}

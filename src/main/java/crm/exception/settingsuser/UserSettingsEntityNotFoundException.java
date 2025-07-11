package crm.exception.settingsuser;

import jakarta.persistence.EntityNotFoundException;

/**
* Exception occurs, if {@link crm.model.settingsuser.UserSettings} not found.
*
* @see crm.service.settingsuser.UserSettingsService
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

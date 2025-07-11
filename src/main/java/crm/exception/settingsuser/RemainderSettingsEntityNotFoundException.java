package crm.exception.settingsuser;

import jakarta.persistence.EntityNotFoundException;

/**
* Exception occurs if {@link crm.model.settingsuser.store.remainder.RemainderSettings} not found.
*
* @see crm.service.settingsuser.store.remainder.RemainderSettingsservice
*/
public class RemainderSettingsEntityNotFoundException extends EntityNotFoundException {
  /**
  * Error message.
  *
  * @param message text error message.
  */
  public RemainderSettingsEntityNotFoundException(String message) {
    super(message);
  }
}

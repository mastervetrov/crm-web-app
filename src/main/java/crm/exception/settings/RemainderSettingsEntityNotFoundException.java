package crm.exception.settings;

import jakarta.persistence.EntityNotFoundException;

/**
* Exception occurs if {@link crm.model.settings.store.remainder.RemainderSettings} not found.
*
* @see crm.service.settings.store.remainder.RemainderSettingsSvc
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

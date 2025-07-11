package crm.request.settingsuser;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import lombok.Data;

/**
 * REQUEST - contains different user settings.
 * Used for update and save user settings.
 *
 * @see UserSettingsDto
 * @see crm.model.settingsuser.UserSettings
 * @see crm.service.settingsuser.UserSettingsService
 */
@Data
public class UserSettingsRequest {

  private RemainderSettingsDto remainderSettings;

}

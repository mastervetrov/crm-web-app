package crm.request.settings;

import crm.dto.settings.remainder.RemainderSettingsDto;
import lombok.Data;

/**
 * REQUEST - contains different user settings.
 * Used for update and save user settings.
 *
 * @see UserSettingsDto
 * @see crm.model.settings.UserSettings
 * @see crm.service.settings.UserSettingsService
 */
@Data
public class UserSettingsUpsertRequest {

  private RemainderSettingsDto remainderSettings;

}

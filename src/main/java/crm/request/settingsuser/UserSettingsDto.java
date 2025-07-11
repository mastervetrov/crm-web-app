package crm.request.settingsuser;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import lombok.Data;

/**
 * Response DTO, содержащий пользовательские настройки.
 * Используется для передачи настроек пользователю и сервисам
 *
 * @see crm.model.settingsuser.UserSettings
 * @see UserSettingsRequest
 * @see crm.service.settingsuser.UserSettingsService
 */
@Data
public class UserSettingsDto {

  private Long id;

  /**
   * Response DTO, содержащий настройки страницы "остатки".
   */
  private RemainderSettingsDto remainderSettings;

}

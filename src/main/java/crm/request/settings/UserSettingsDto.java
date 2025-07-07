package crm.request.settings;

import crm.dto.settings.remainder.RemainderSettingsDto;
import lombok.Data;

/**
 * Response DTO, содержащий пользовательские настройки.
 * Используется для передачи настроек пользователю и сервисам
 *
 * @see crm.model.settings.UserSettings
 * @see UserSettingsUpsertRequest
 * @see crm.service.settings.UserSettingsService
 */
@Data
public class UserSettingsDto {

  private Long id;

  /**
   * Response DTO, содержащий настройки страницы "остатки".
   */
  private RemainderSettingsDto remainderSettings;

}

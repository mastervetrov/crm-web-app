package crm.startup.settings;

import crm.dto.settings.remainder.RemainderSettingsDto;
import crm.request.settings.UserSettingsUpsertRequest;
import crm.service.settings.UserSettingsService;
import crm.service.settings.store.remainder.RemainderSettingsSvc;
import crm.startup.DatabaseSeeder;
import crm.startup.settings.store.remainder.RemainderFieldInitializer;
import crm.startup.settings.store.remainder.RemainderSettingsInitializer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
* This class performs initialize all user settings before run app.
* todo дополнить doc
*
* @see RemainderFieldInitializer
* @see RemainderSettingsInitializer
* @see UserSettingsService
*/
@Component
@AllArgsConstructor
public class SettingsInitializer implements DatabaseSeeder {
  private final RemainderFieldInitializer remainderFieldInitializer;
  private final RemainderSettingsInitializer remainderSettingsInitializer;
  private final RemainderSettingsSvc remainderSettingsService;
  private final UserSettingsService userSettingsService;

  /**
  * Create data.
  * todo дополнить
  */
  public void initialize() {
    UserSettingsUpsertRequest userSettingsUpsertRequest = new UserSettingsUpsertRequest();
    RemainderSettingsDto remainderSettingsDto = new RemainderSettingsDto();
    userSettingsUpsertRequest.setRemainderSettings(remainderSettingsDto);
    userSettingsService.save(userSettingsUpsertRequest);

    remainderSettingsInitializer.initialize();
    remainderFieldInitializer.initialize();
  }
}

package crm.startup.settingsuser;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import crm.request.settingsuser.UserSettingsRequest;
import crm.service.settingsuser.UserSettingsService;
import crm.service.settingsuser.store.remainder.RemainderSettingsService;
import crm.startup.DatabaseSeeder;
import crm.startup.settingsuser.store.remainder.RemainderFieldInitializer;
import crm.startup.settingsuser.store.remainder.RemainderSettingsInitializer;
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
  private final RemainderSettingsService remainderSettingsService;
  private final UserSettingsService userSettingsService;

  /**
  * Create data.
  * todo дополнить
  */
  public void initialize() {
    UserSettingsRequest userSettingsUpsertRequest = new UserSettingsRequest();
    RemainderSettingsDto remainderSettingsDto = new RemainderSettingsDto();
    userSettingsUpsertRequest.setRemainderSettings(remainderSettingsDto);
    userSettingsService.save(userSettingsUpsertRequest);

    remainderSettingsInitializer.initialize();
    remainderFieldInitializer.initialize();
  }
}

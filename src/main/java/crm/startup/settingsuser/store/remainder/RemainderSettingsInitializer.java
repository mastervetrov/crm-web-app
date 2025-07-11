package crm.startup.settingsuser.store.remainder;

import crm.service.settingsuser.store.remainder.RemainderFieldService;
import crm.service.settingsuser.store.remainder.RemainderSettingsService;
import crm.startup.DatabaseSeeder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
* Initialize RemainderSettings entities after run app.
*
*/
@Component
@AllArgsConstructor
@Slf4j
public class RemainderSettingsInitializer implements DatabaseSeeder {

  private final RemainderFieldService remainderFieldService;
  private final RemainderSettingsService remainderSettingsService;

  @Override
  public void initialize() {

  }
}

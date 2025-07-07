package crm.startup.settings.store.remainder;

import crm.service.settings.store.remainder.RemainderFieldSvc;
import crm.service.settings.store.remainder.RemainderSettingsSvc;
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

  private final RemainderFieldSvc remainderFieldService;
  private final RemainderSettingsSvc remainderSettingsService;

  @Override
  public void initialize() {

  }
}

package crm.startup;

import crm.startup.product.ProductInitializer;
import crm.startup.settings.SettingsInitializer;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Initialize all starters data from work app.
 * UserSettings, Product etc.
 */
@Component
@AllArgsConstructor
public class DatabaseInitializer {

  private final ProductInitializer productInitializer;
  private final SettingsInitializer settingsInitializer;

  /**
   * Method {@link PostConstruct} for starting initialize.
   */
  @PostConstruct
  public void handleContextRefresh() {
    productInitializer.initialize();
    settingsInitializer.initialize();
  }
}
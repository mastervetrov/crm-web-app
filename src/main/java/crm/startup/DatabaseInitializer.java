package crm.startup;

import jakarta.annotation.PostConstruct;
import crm.startup.product.ProductInitializer;
import crm.startup.settings.SettingsInitializer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DatabaseInitializer {
    private final ProductInitializer productInitializer;
    private final SettingsInitializer settingsInitializer;
    @PostConstruct
    public void handleContextRefresh(){
        productInitializer.initialize();
    }
}
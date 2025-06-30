package crm.startup.settings;

import crm.startup.DatabaseSeeder;
import crm.startup.settings.store.remainder.DisplayRemainderFieldInitializer;
import crm.startup.settings.store.remainder.RemainderSettingsInitializer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SettingsInitializer implements DatabaseSeeder {
    private final DisplayRemainderFieldInitializer remainderInitializer;
    private final RemainderSettingsInitializer remainderSettingsInitializer;

    public void initialize() {
        remainderInitializer.initialize();
        remainderSettingsInitializer.initialize();
    }
}

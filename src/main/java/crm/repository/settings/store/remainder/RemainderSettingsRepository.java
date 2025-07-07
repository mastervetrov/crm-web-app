package crm.repository.settings.store.remainder;

import crm.model.settings.store.remainder.RemainderSettings;
import crm.service.settings.store.remainder.RemainderSettingsSvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository RemainderSettings.
 *
 * @see RemainderSettingsSvc
 * @see RemainderSettings
 */
@Repository
public interface RemainderSettingsRepository extends JpaRepository<RemainderSettings, Long> {
}

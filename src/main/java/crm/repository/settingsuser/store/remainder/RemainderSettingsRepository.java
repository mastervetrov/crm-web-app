package crm.repository.settingsuser.store.remainder;

import crm.model.settingsuser.store.remainder.RemainderSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository RemainderSettings.
 *
 * @see RemainderSettingsservice
 * @see RemainderSettings
 */
@Repository
public interface RemainderSettingsRepository extends JpaRepository<RemainderSettings, Long> {
}

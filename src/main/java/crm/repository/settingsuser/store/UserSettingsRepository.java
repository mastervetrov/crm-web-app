package crm.repository.settingsuser.store;

import crm.model.settingsuser.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserSettings repository.
 *
 * @see UserSettings
 * @see crm.service.settingsuser.UserSettingsService
 */
@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long> {
}

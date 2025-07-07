package crm.repository.settings.store;

import crm.model.settings.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserSettings repository.
 *
 * @see UserSettings
 * @see crm.service.settings.UserSettingsService
 */
@Repository
public interface UserSettingsRepository extends JpaRepository<UserSettings, Long> {
}

package crm.repository.settings.store.remainder;

import crm.model.settings.store.remainder.RemainderSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainderSettingsRepository extends JpaRepository<RemainderSettings, Long> {
}

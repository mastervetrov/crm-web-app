package crm.repository.settingsuser.store.remainder;

import crm.model.settingsuser.store.remainder.RemainderField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * RemainderField repository.
 *
 * @see RemainderField
 * @see RemainderFieldservice
 */
@Repository
public interface RemainderFieldRepository extends JpaRepository<RemainderField, Long> {
}

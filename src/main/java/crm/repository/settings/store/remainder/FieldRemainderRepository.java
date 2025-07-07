package crm.repository.settings.store.remainder;

import crm.model.settings.store.remainder.RemainderField;
import crm.service.settings.store.remainder.RemainderFieldSvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * RemainderField repository.
 *
 * @see RemainderField
 * @see RemainderFieldSvc
 */
@Repository
public interface FieldRemainderRepository extends JpaRepository<RemainderField, Long> {
}

package crm.repository.settings.store.remainder;

import crm.model.settings.store.remainder.DisplayedRemainderField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayedRemainderFieldRepository extends JpaRepository<DisplayedRemainderField, Long> {
}

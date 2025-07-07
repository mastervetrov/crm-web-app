package crm.repository;

import crm.model.location.Location;
import crm.service.location.LocationSvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Location entity.
 *
 * @see LocationSvc
 * @see Location
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}

package crm.repository;

import crm.model.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Location entity.
 *
 * @see crm.service.location.LocationService
 * @see Location
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}

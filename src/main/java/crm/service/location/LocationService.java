package crm.service.location;

import crm.dto.location.LocationDto;
import crm.mapper.location.LocationMapper;
import crm.model.location.Location;
import crm.repository.LocationRepository;
import crm.request.location.LocationRequest;
import crm.service.CrudService;
import org.springframework.stereotype.Service;

/**
 * Crud service for entity location.
 *
 * @see Location
 * @see LocationDto
 * @see LocationRepository
 * @see LocationRequest
 * @see LocationMapper
 */
@Service
public class LocationService extends CrudService<
        LocationRequest,
        Location,
        LocationDto,
        LocationMapper,
        LocationRepository> {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link LocationMapper}
   * @param repository repository {@link LocationRepository}
   */
  public LocationService(LocationMapper mapper, LocationRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(Location entity) {
    return entity.getId();
  }
}

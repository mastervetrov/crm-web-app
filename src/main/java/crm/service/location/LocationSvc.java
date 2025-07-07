package crm.service.location;

import crm.dto.location.LocationDto;
import crm.request.location.LocationUpsertRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
* Interface - CRUD service for operations with entities Location.
*
* @see crm.repository.LocationRepository
* @see crm.model.location.Location
* @see crm.mapper.location.LocationMapper
* @see LocationUpsertRequest
* @see LocationDto
*/
@Service
public interface LocationSvc {

  /**
  * Finds all Location entities and maps them to LocationDto objects.
  * The result is returned as a paginated {@link Page} of {@link LocationDto}.
  *
  * @param pageNumber the page number to retrieve (0-based).
  * @param pageSize the number of items per page.
  * @return a {@link Page} containing {@link LocationDto} objects
  */
  Page<LocationDto> findAll(Integer pageNumber, Integer pageSize);

  /**
  * Method find Location entity by id and maps it to LocationDto object.
  * The result is returned as dto instance {@link LocationDto}.
  *
  * @param id target identifier
  * @return {@link LocationDto}
  */
  LocationDto findById(Long id);

  /**
  * Maps request to entity and save in {@link crm.repository.LocationRepository}.
  * The result entity is returned as dto instance {@link LocationDto}.
  *
  * @param request {@link LocationUpsertRequest}
  * @return {@link LocationDto}
  */
  LocationDto save(LocationUpsertRequest request);

  /**
  * Find entity by id and get from the {@link crm.repository.LocationRepository}.
  * The result entity is compared with request, after mapping.
  * If at least one field is different, an update occurs.
  * The output is updated entity in the form dto.
  *
  * @param id target identifier
  * @param request {@link LocationUpsertRequest}
  * @return {@link LocationDto}
  */
  LocationDto updateById(Long id, LocationUpsertRequest request);

  /**
  * Method for deleting entity by id.
  *
  * @param id target identifier.
  */
  void deleteById(Long id);
}

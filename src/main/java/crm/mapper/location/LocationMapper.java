package crm.mapper.location;

import crm.dto.location.LocationDto;
import crm.model.location.Location;
import crm.request.location.LocationUpsertRequest;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * Mapper for entity {@link Location}.
 *
 * @see Location
 * @see LocationDto
 * @see LocationUpsertRequest
 * @see crm.service.location.LocationSvc
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper {

  /**
   * Mapping request {@link LocationUpsertRequest} to entity {@link Location}.
   * Used for preserving location;
   *
   * @param request contains data
   * @return entity instance {@link Location} with id == null
   */
  Location requestToEntity(LocationUpsertRequest request);

  /**
   * Mapping request {@link LocationUpsertRequest} to entity {@link Location},
   * setting specified id.
   *
   * @param id - identifier, to be set in the entity
   * @param request contains data
   * @return entity instance {@link Location} with installed id
   */
  Location requestToEntity(Long id, LocationUpsertRequest request);

  /**
   * Mapping entity {@link Location} to dto {@link LocationDto}.
   * Used when getting location.
   *
   * @param location contains data
   * @return dto instance {@link LocationDto}
   */
  LocationDto locationToLocationDto(Location location);

  /**
   * Mapping entity list {@link Location} to dto list {@link LocationDto}.
   * Used when getting locations list.
   *
   * @param locationList entity List {@link Location}
   * @return dto list {@link LocationDto}
   */
  List<LocationDto> locationListToLocationDtoList(List<Location> locationList);

  /**
   * Mapping entity page {@link Location} to dto page {@link LocationDto}.
   * Used when getting locations page.
   *
   * @param page entity page {@link Location}
   * @return dto page {@link LocationDto}
   */
  default Page<LocationDto> locationPageToLocationDtoPage(Page<Location> page) {
    List<Location> locationList = page.getContent();
    List<LocationDto> listDto = locationListToLocationDtoList(locationList);
    Pageable pageable = page.getPageable();
    Integer totalPages = page.getTotalPages();
    Page<LocationDto> locationDtoPage = new PageImpl<>(listDto, pageable, totalPages);
    return locationDtoPage;
  }
}

package crm.service.location;

import crm.dto.location.LocationDto;
import crm.exception.location.LocationEntityNotFoundException;
import crm.mapper.location.LocationMapper;
import crm.model.location.Location;
import crm.repository.LocationRepository;
import crm.request.location.LocationUpsertRequest;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Crud service for entity location.
 *
 * @see Location
 * @see LocationDto
 * @see LocationRepository
 * @see LocationUpsertRequest
 * @see LocationMapper
 */
@Service
@AllArgsConstructor
public class LocationSvcImpl implements LocationSvc {

  private final LocationRepository locationRepository;
  private final LocationMapper locationMapper;

  @Override
  public Page<LocationDto> findAll(Integer pageNumber, Integer pageSize) {
    Pageable pageable = PageRequest.of(pageNumber, pageSize);
    Page<Location> locationPage = locationRepository.findAll(pageable);
    Page<LocationDto> locationDtoPage = locationMapper.locationPageToLocationDtoPage(locationPage);
    return locationDtoPage;
  }

  @Override
  public LocationDto findById(Long id) {
    Location location = locationRepository.findById(id).orElseThrow(() -> {
      String errorMessage = "Location with id " + id + " not found";
      throw new LocationEntityNotFoundException(errorMessage); });
    LocationDto locationDto = locationMapper.locationToLocationDto(location);
    return locationDto;
  }

  @Override
  public LocationDto save(LocationUpsertRequest request) {
    Location location = locationRepository.save(locationMapper.requestToEntity(request));
    return locationMapper.locationToLocationDto(location);
  }

  @Override
  public LocationDto updateById(Long id, LocationUpsertRequest request) {
    locationRepository.findById(id).orElseThrow(() -> {
      String errorMessage = "Location with id " + id + " not found";
      throw new LocationEntityNotFoundException(errorMessage); });
    Location location = locationRepository.save(locationMapper.requestToEntity(id, request));
    return locationMapper.locationToLocationDto(location);
  }

  @Override
  public void deleteById(Long id) {
    locationRepository.findById(id).orElseThrow(() -> {
      String errorMessage = "Location with id " + id + " not found";
      throw new LocationEntityNotFoundException(errorMessage); });
    locationRepository.deleteById(id);
  }
}

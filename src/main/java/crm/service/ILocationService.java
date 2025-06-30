package crm.service;

import crm.dto.location.request.LocationUpsertRequest;
import crm.dto.location.response.LocationDto;
import crm.exception.location.LocationEntityNotFoundException;
import crm.mapper.location.LocationMapper;
import crm.model.location.Location;
import crm.repository.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ILocationService implements LocationService{

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
        Location location = locationRepository.findById(id).orElseThrow(() -> {throw new LocationEntityNotFoundException("Location with id " + id + " not found");});
        LocationDto locationDto = locationMapper.locationToLocationDto(location);
        return locationDto;
    }

    @Override
    public LocationDto save(LocationUpsertRequest request) {
        Location location = locationRepository.save(locationMapper.locationRequestToLocation(request));
        return locationMapper.locationToLocationDto(location);
    }

    @Override
    public LocationDto updateById(Long id, LocationUpsertRequest request) {
        locationRepository.findById(id).orElseThrow(() -> {throw new LocationEntityNotFoundException("Location with id " + id + " not found");});
        Location location = locationRepository.save(locationMapper.locationRequestToLocation(id, request));
        return locationMapper.locationToLocationDto(location);
    }

    @Override
    public void deleteById(Long id) {
        locationRepository.findById(id).orElseThrow(() -> {throw new LocationEntityNotFoundException("Location with id " + id + " not found");});
        locationRepository.deleteById(id);
    }
}

package crm.mapper.location;

import crm.dto.location.request.LocationUpsertRequest;
import crm.dto.location.response.LocationDto;
import crm.model.location.Location;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper {
    Location locationRequestToLocation(LocationUpsertRequest request);
    Location locationRequestToLocation(Long id, LocationUpsertRequest request);
    LocationDto locationToLocationDto(Location location);
    List<LocationDto> locationListToLocationDtoList(List<Location> locationList);

    default Page<LocationDto> locationPageToLocationDtoPage(Page<Location> locationPage) {
        List<Location> locationList = locationPage.getContent();
        List<LocationDto> locationDtoList = locationListToLocationDtoList(locationList);
        Page<LocationDto> locationDtoPage = new PageImpl<>(locationDtoList, locationPage.getPageable(), locationPage.getTotalPages());
        return locationDtoPage;
    }
}

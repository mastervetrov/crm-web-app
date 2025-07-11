package crm.mapper.location;

import crm.dto.location.LocationDto;
import crm.mapper.BaseMapper;
import crm.model.location.Location;
import crm.request.location.LocationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link Location}.
 *
 * @see Location
 * @see LocationDto
 * @see LocationRequest
 * @see crm.service.location.LocationService
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper extends BaseMapper<LocationRequest, Location, LocationDto> {
}

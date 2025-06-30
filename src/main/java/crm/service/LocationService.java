package crm.service;

import crm.dto.location.request.LocationUpsertRequest;
import crm.dto.location.response.LocationDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface LocationService {
    Page<LocationDto> findAll(Integer pageNumber, Integer pageSize);

    LocationDto findById(Long id);

    LocationDto save(LocationUpsertRequest request);

    LocationDto updateById(Long id, LocationUpsertRequest request);

    void deleteById(Long id);
}

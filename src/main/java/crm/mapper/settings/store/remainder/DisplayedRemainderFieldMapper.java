package crm.mapper.settings.store.remainder;

import crm.dto.settings.request.store.remainder.DisplayedRemainderFieldUpsertRequest;
import crm.model.settings.store.remainder.DisplayedRemainderField;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DisplayedRemainderFieldMapper {
    DisplayedRemainderField requestToEntity(DisplayedRemainderFieldUpsertRequest request);
    DisplayedRemainderField requestToEntity(Long id, DisplayedRemainderFieldUpsertRequest request);
    
}

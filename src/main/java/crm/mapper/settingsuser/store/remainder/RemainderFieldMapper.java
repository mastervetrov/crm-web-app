package crm.mapper.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderFieldDto;
import crm.mapper.BaseMapper;
import crm.model.settingsuser.store.remainder.RemainderField;
import crm.request.settingsuser.store.remainder.RemainderFieldRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity RemainderField.
 *
 * @see RemainderFieldDto
 * @see RemainderFieldRequest
 * @see RemainderFieldservice
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RemainderFieldMapper extends BaseMapper<RemainderFieldRequest,
        RemainderField,
        RemainderFieldDto> {
}

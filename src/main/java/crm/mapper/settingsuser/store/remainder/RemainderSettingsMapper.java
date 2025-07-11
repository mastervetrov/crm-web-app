package crm.mapper.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import crm.mapper.BaseMapper;
import crm.model.settingsuser.store.remainder.RemainderSettings;
import crm.request.settingsuser.store.remainder.RemainderSettingsRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link RemainderSettings}.
 *
 * @see RemainderSettings
 * @see RemainderSettingsDto
 * @see RemainderSettingsRequest
 * @see RemainderSettingsservice
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RemainderSettingsMapper extends BaseMapper<RemainderSettingsRequest,
        RemainderSettings,
        RemainderSettingsDto> {
}

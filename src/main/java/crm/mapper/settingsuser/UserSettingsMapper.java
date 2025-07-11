package crm.mapper.settingsuser;

import crm.mapper.BaseMapper;
import crm.model.settingsuser.UserSettings;
import crm.request.settingsuser.UserSettingsDto;
import crm.request.settingsuser.UserSettingsRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity UserSettings.
 *
 * @see UserSettingsDto
 * @see UserSettingsRequest
 * @see crm.service.settingsuser.UserSettingsService
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserSettingsMapper extends BaseMapper<UserSettingsRequest,
        UserSettings,
        UserSettingsDto> {
}

package crm.mapper.settings;

import crm.model.settings.UserSettings;
import crm.request.settings.UserSettingsDto;
import crm.request.settings.UserSettingsUpsertRequest;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity UserSettings.
 *
 * @see UserSettingsDto
 * @see UserSettingsUpsertRequest
 * @see crm.service.settings.UserSettingsService
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserSettingsMapper {

  /**
   * Mapping request {@link UserSettingsUpsertRequest} to entity {@link UserSettings}.
   * Used for preserving the user settings.
   *
   * @param request contains data.
   * @return entity instance {@link UserSettings} with id == null.
   */
  UserSettings requestToEntity(UserSettingsUpsertRequest request);

  /**
   * Mapping request {@link UserSettingsUpsertRequest} to entity {@link UserSettings},
   * setting specified id.
   * Used, when updating the user settings.
   *
   * @param id identifier to be set in the entity.
   * @param request data for updating user settings.
   * @return entity instance {@link UserSettings} with installed id.
   */
  UserSettings requestToEntity(Long id, UserSettingsUpsertRequest request);

  /**
   * Mapping entity {@link UserSettings} to dto {@link UserSettingsDto}.
   * Used, when getting the user settings.
   *
   * @param userSettings data user settings.
   * @return dto instance {@link UserSettingsDto}.
   */
  UserSettingsDto entityToDto(UserSettings userSettings);

  /**
   * Mapping list entity {@link UserSettings} to list dto {@link UserSettingsDto}.
   *
   * @param userSettingsList entity list.
   * @return list dto.
   */
  List<UserSettingsDto> entityListToDtoList(List<UserSettings> userSettingsList);

}

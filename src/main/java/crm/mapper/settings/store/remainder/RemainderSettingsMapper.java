package crm.mapper.settings.store.remainder;

import crm.dto.settings.remainder.RemainderSettingsDto;
import crm.model.settings.store.remainder.RemainderSettings;
import crm.request.settings.store.remainder.RemainderSettingsUpsertRequest;
import crm.service.settings.store.remainder.RemainderSettingsSvc;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link RemainderSettings}.
 *
 * @see RemainderSettings
 * @see RemainderSettingsDto
 * @see RemainderSettingsUpsertRequest
 * @see RemainderSettingsSvc
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RemainderSettingsMapper {

  /**
   * Mapping request {@link RemainderSettingsUpsertRequest} to {@link RemainderSettings}.
   * Used for preserve remainder settings.
   *
   * @param request contains data.
   * @return entity instance {@link RemainderSettings} with id == null.
   */
  RemainderSettings requestToEntity(RemainderSettingsUpsertRequest request);

  /**
   * Mapping request {@link RemainderSettingsUpsertRequest} to {@link RemainderSettings},
   * setting specified id.
   *
   * @param id identifier, to be set in the entity.
   * @param request contains data.
   * @return entity instance {@link RemainderSettings} with installed id.
   */
  RemainderSettings requestToEntity(Long id, RemainderSettingsUpsertRequest request);

  /**
   * Mapping entity {@link RemainderSettings} to dto {@link RemainderSettingsDto}.
   * Used, when getting the remainder settings.
   *
   * @param remainderSettings - contains data.
   * @return dto instance {@link RemainderSettingsDto}.
   */
  RemainderSettingsDto entityToDto(RemainderSettings remainderSettings);

  /**
   * Mapping list entity {@link RemainderSettings} to list dto {@link RemainderSettingsDto}.
   * Used, when getting the remainders settings list.
   *
   * @param remainderSettingsList - contains list entity.
   * @return list dto.
   */
  List<RemainderSettingsDto>  entityListToDtoList(List<RemainderSettings> remainderSettingsList);
}

package crm.mapper.settings.store.remainder;

import crm.dto.settings.remainder.RemainderFieldDto;
import crm.model.settings.store.remainder.RemainderField;
import crm.request.settings.store.remainder.RemainderFieldUpsertRequest;
import crm.service.settings.store.remainder.RemainderFieldSvc;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity RemainderField.
 *
 * @see RemainderFieldDto
 * @see RemainderFieldUpsertRequest
 * @see RemainderFieldSvc
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RemainderFieldMapper {

  /**
   * Mapping request {@link RemainderFieldUpsertRequest} to entity {@link RemainderField}.
   * Used, when preserve the remainder field.
   *
   * @param request contains data.
   * @return entity instance {@link RemainderField} with id == null.
   */
  RemainderField requestToEntity(RemainderFieldUpsertRequest request);

  /**
   * Mapping request {@link RemainderFieldUpsertRequest} to entity {@link RemainderField},
   * setting specified id.
   * Used, when updating the remainder field.
   *
   * @param id identifier to be set in the entity.
   * @param request data for updating remainder field.
   * @return entity instance {@link RemainderField} with id == null.
   */
  RemainderField requestToEntity(Long id, RemainderFieldUpsertRequest request);

  /**
   * Mapping entity {@link RemainderField} to dto {@link RemainderFieldDto}.
   * Used, when getting the remainder field.
   *
   * @param remainderField data remainder field.
   * @return dto instance {@link RemainderFieldDto}
   */
  RemainderFieldDto entityToDto(RemainderField remainderField);

  /**
   * Mapping list entity {@link RemainderField} to list dto {@link RemainderFieldDto}.
   *
   * @param entityList entity list.
   * @return list dto.
   */
  List<RemainderFieldDto> entityListToDtoList(List<RemainderField> entityList);

}

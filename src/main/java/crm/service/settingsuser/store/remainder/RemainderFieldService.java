package crm.service.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderFieldDto;
import crm.mapper.settingsuser.store.remainder.RemainderFieldMapper;
import crm.model.settingsuser.store.remainder.RemainderField;
import crm.repository.settingsuser.store.remainder.RemainderFieldRepository;
import crm.request.settingsuser.store.remainder.RemainderFieldRequest;
import crm.service.CrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* Crud service for entity remainder settings.
*
* @see RemainderField
* @see RemainderFieldDto
* @see RemainderFieldRepository
* @see RemainderFieldMapper
* @see RemainderFieldRequest
*/
@Service
@Slf4j
public class RemainderFieldService extends CrudService<
        RemainderFieldRequest,
        RemainderField,
        RemainderFieldDto,
        RemainderFieldMapper,
        RemainderFieldRepository> {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link RemainderFieldMapper}
   * @param repository {@link RemainderFieldRepository}
   */
  public RemainderFieldService(RemainderFieldMapper mapper, RemainderFieldRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(RemainderField entity) {
    return entity.getId();
  }
}

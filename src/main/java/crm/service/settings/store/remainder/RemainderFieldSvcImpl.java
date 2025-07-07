package crm.service.settings.store.remainder;

import crm.dto.settings.remainder.RemainderFieldDto;
import crm.mapper.settings.store.remainder.RemainderFieldMapper;
import crm.model.settings.store.remainder.RemainderField;
import crm.repository.settings.store.remainder.FieldRemainderRepository;
import crm.request.settings.store.remainder.RemainderFieldUpsertRequest;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* Crud service for entity remainder settings.
*
* @see RemainderField
* @see RemainderFieldDto
* @see FieldRemainderRepository
* @see RemainderFieldMapper
* @see RemainderFieldUpsertRequest
*/
@Service
@AllArgsConstructor
@Slf4j
public class RemainderFieldSvcImpl implements RemainderFieldSvc<RemainderFieldDto> {

  private final FieldRemainderRepository repository;
  private final RemainderFieldMapper mapper;

  @Override
  public List<RemainderFieldDto> findAll() {
    return null;
  }

  @Override
  public RemainderFieldDto findById(Long id) {
    return null;
  }

  @Override
  public RemainderFieldDto save(RemainderFieldUpsertRequest request) {
    log.info("попытка сохранить request: " + request.toString());
    RemainderField displayedRemainderField = repository.save(mapper.requestToEntity(request));
    log.info("попытка вернуть response: " + displayedRemainderField.toString());
    return mapper.entityToDto(displayedRemainderField);
  }

  @Override
  public RemainderFieldDto updateById(Long id, RemainderFieldUpsertRequest request) {
    return null;
  }
}

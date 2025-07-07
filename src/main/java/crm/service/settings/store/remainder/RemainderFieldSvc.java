package crm.service.settings.store.remainder;

import crm.dto.settings.remainder.RemainderFieldDto;
import crm.request.settings.store.remainder.RemainderFieldUpsertRequest;
import java.util.List;
import org.springframework.stereotype.Service;

/**
* Interface - service for work with RemainderField.
*
* @see RemainderFieldDto
* @see crm.model.settings.store.remainder.RemainderField
* @see RemainderFieldUpsertRequest
*
* @param <RemainderFieldDtoT> {@link RemainderFieldDto}.
*/
@Service
public interface RemainderFieldSvc<RemainderFieldDtoT> {

  /**
  * Find dto list {@link RemainderFieldDto}.
  *
  * @return dto list {@link RemainderFieldDto}
  */
  List<RemainderFieldDtoT> findAll();

  /**
  * Find dto {@link RemainderFieldDto} by id .
  *
  * @return dto instance {@link RemainderFieldDto}
  */
  RemainderFieldDtoT findById(Long id);

  /**
  * Save request {@link crm.request.settings.store.remainder.RemainderSettingsUpsertRequest}.
  *
  * @return saved dto {@link RemainderFieldDto}
  */
  RemainderFieldDtoT save(RemainderFieldUpsertRequest request);

  /**
  * Update request {@link RemainderFieldUpsertRequest} by id.
  *
  * @return updatable dto {@link RemainderFieldDto}
  */
  RemainderFieldDtoT updateById(Long id, RemainderFieldUpsertRequest request);

}

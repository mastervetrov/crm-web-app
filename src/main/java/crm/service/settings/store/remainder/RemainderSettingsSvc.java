package crm.service.settings.store.remainder;

import crm.dto.settings.remainder.RemainderFieldDto;
import crm.dto.settings.remainder.RemainderSettingsDto;
import crm.request.settings.store.remainder.RemainderSettingsUpsertRequest;
import org.springframework.stereotype.Service;

/**
 * Interface - service CRUD for work with RemainderSettings.
 *
 * @see RemainderSettingsDto
 * @see crm.model.settings.store.remainder.RemainderSettings
 * @see RemainderSettingsUpsertRequest
 *
 * @param <RemainderSettingsDtoT> {@link RemainderSettingsDto}
 */
@Service
public interface RemainderSettingsSvc<RemainderSettingsDtoT> {

  /**
  * Find dto {@link RemainderSettingsDto} by id.
  *
  * @return dto instance {@link RemainderSettingsDto}
  */
  RemainderSettingsDtoT findById(Long id);

  /**
  * Save request {@link crm.request.settings.store.remainder.RemainderSettingsUpsertRequest}.
  *
  * @return saved dto {@link RemainderFieldDto}
  */
  RemainderSettingsDtoT save(RemainderSettingsUpsertRequest request);

  /**
  * Update request {@link RemainderSettingsUpsertRequest} by id.
  *
  * @param id identifier, to be set in the entity
  * @param request contains data
  *
  * @return updatable dto {@link RemainderSettingsDto}
  */
  RemainderSettingsDtoT updateById(Long id, RemainderSettingsUpsertRequest request);

  /**
  * Deleting entity {@link crm.model.settings.store.remainder.RemainderSettings} by id.
  *
  * @param id - identifier for deleting by id
  */
  void deleteById(Long id);
}

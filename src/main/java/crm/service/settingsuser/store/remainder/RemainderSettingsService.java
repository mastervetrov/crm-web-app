package crm.service.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import crm.mapper.settingsuser.store.remainder.RemainderSettingsMapper;
import crm.model.settingsuser.store.remainder.RemainderSettings;
import crm.repository.settingsuser.store.remainder.RemainderSettingsRepository;
import crm.request.settingsuser.store.remainder.RemainderSettingsRequest;
import crm.service.CrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Crud service for entity remainder settings.
 *
 * @see RemainderSettings
 * @see RemainderSettingsDto
 * @see RemainderSettingsRepository
 * @see RemainderSettingsMapper
 * @see RemainderSettingsRequest
 */
@Service
@Slf4j
public class RemainderSettingsService extends CrudService<
        RemainderSettingsRequest,
        RemainderSettings,
        RemainderSettingsDto,
        RemainderSettingsMapper,
        RemainderSettingsRepository
        > {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link RemainderSettingsMapper}
   * @param repository repository {@link RemainderSettingsRepository}
   */
  public RemainderSettingsService(RemainderSettingsMapper mapper,
                                  RemainderSettingsRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(RemainderSettings entity) {
    return entity.getId();
  }
}

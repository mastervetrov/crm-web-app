package crm.service.settingsuser;

import crm.mapper.settingsuser.UserSettingsMapper;
import crm.model.settingsuser.UserSettings;
import crm.repository.settingsuser.store.UserSettingsRepository;
import crm.request.settingsuser.UserSettingsDto;
import crm.request.settingsuser.UserSettingsRequest;
import crm.service.CrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * User settings CRUD service.
 * todo дополнить
 *
 * @see UserSettings
 * @see UserSettingsDto
 * @see UserSettingsMapper
 * @see UserSettingsRepository
 * @see UserSettingsRequest
 */
@Service
@Slf4j
public class UserSettingsService extends CrudService<
        UserSettingsRequest,
        UserSettings,
        UserSettingsDto,
        UserSettingsMapper,
        UserSettingsRepository> {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link UserSettingsMapper}
   * @param repository repository {@link UserSettingsRepository}
   */
  public UserSettingsService(UserSettingsMapper mapper, UserSettingsRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(UserSettings entity) {
    return entity.getId();
  }
}

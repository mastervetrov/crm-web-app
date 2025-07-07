package crm.service.settings;

import crm.exception.settings.UserSettingsEntityNotFoundException;
import crm.mapper.settings.UserSettingsMapper;
import crm.model.settings.UserSettings;
import crm.repository.settings.store.UserSettingsRepository;
import crm.request.settings.UserSettingsDto;
import crm.request.settings.UserSettingsUpsertRequest;
import java.util.List;
import lombok.AllArgsConstructor;
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
 * @see UserSettingsUpsertRequest
 */
@Service
@AllArgsConstructor
@Slf4j
public class UserSettingsServiceImpl implements UserSettingsService<UserSettingsDto> {

  private final UserSettingsRepository repository;
  private final UserSettingsMapper mapper;

  @Override
  public List<UserSettingsDto> findAll() {
    List<UserSettings> userSettingsList = repository.findAll();
    return mapper.entityListToDtoList(userSettingsList);
  }

  @Override
  public UserSettingsDto findById(Long id) {
    UserSettings userSettings = repository.findById(id).orElseThrow(() -> {
      throw new UserSettingsEntityNotFoundException("Сущность User Settings не найдена"); });
    return mapper.entityToDto(userSettings);
  }

  @Override
  public UserSettingsDto save(UserSettingsUpsertRequest request) {
    log.info("request перед маппингом" + request.toString());
    UserSettings userSettingsPreSaved = mapper.requestToEntity(request);
    log.info("userSettings после маппинга" + userSettingsPreSaved.toString());
    UserSettings userSettings = repository.save(userSettingsPreSaved);
    log.info("Попытка вернуть response" + userSettings.toString());
    return mapper.entityToDto(userSettings);
  }

  @Override
  public UserSettingsDto updateById(Long id, UserSettingsUpsertRequest request) {
    return null;
  }

}

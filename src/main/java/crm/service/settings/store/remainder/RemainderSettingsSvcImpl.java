package crm.service.settings.store.remainder;

import crm.dto.settings.remainder.RemainderSettingsDto;
import crm.exception.settings.RemainderSettingsEntityNotFoundException;
import crm.mapper.settings.store.remainder.RemainderSettingsMapper;
import crm.model.settings.store.remainder.RemainderSettings;
import crm.repository.settings.store.remainder.RemainderSettingsRepository;
import crm.request.settings.store.remainder.RemainderSettingsUpsertRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Crud service for entity remainder settings.
 *
 * @see RemainderSettings
 * @see RemainderSettingsDto
 * @see RemainderSettingsRepository
 * @see RemainderSettingsMapper
 * @see RemainderSettingsUpsertRequest
 */
@Service
@AllArgsConstructor
@Slf4j
public class RemainderSettingsSvcImpl implements RemainderSettingsSvc<RemainderSettingsDto> {

  private final RemainderSettingsRepository repository;
  private final RemainderSettingsMapper mapper;

  @Override
  public RemainderSettingsDto findById(Long id) {
    RemainderSettings remainderSettings = repository.findById(id).orElseThrow(() -> {
      String errorMessage = " Сущность RemainderSettings не найдена: " + id;
      throw new RemainderSettingsEntityNotFoundException(errorMessage); });
    return mapper.entityToDto(remainderSettings);
  }

  @Override
  public RemainderSettingsDto save(RemainderSettingsUpsertRequest request) {
    log.info("Попытка сохранить request: " + request.toString());
    RemainderSettings remainderSettings = repository.save(mapper.requestToEntity(request));
    log.info("Попытка вернуть response: " + remainderSettings.toString());
    return mapper.entityToDto(remainderSettings);
  }

  @Override
  public RemainderSettingsDto updateById(Long id, RemainderSettingsUpsertRequest request) {
    RemainderSettings remainderSettingsUpdatable = repository.findById(id).orElseThrow(() -> {
      String errorMessage = " Сущность RemainderSettings не найдена: " + id;
      throw new RemainderSettingsEntityNotFoundException(errorMessage); });
    RemainderSettings remainderSettingsUpdated = repository.save(mapper.requestToEntity(request));
    return mapper.entityToDto(remainderSettingsUpdated);
  }

  @Override
  public void deleteById(Long id) {
    if (repository.existsById(id)) {
      repository.deleteById(id);
    }
  }
}

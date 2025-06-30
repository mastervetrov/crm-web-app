package crm.service.settings.store.remainder;

import crm.dto.settings.request.store.remainder.RemainderSettingsUpsertRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface RemainderSettingsService<RemainderSettingsDto> {

    Page<RemainderSettingsDto> findAll(Integer pageNumber, Integer pageSize);

    RemainderSettingsDto findById(Long id);

    RemainderSettingsDto save(RemainderSettingsUpsertRequest request);

    RemainderSettingsDto updateById(Long id, RemainderSettingsUpsertRequest request);

    void deleteById(Long id);
}

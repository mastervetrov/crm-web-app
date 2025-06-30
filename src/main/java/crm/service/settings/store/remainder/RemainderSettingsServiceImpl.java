package crm.service.settings.store.remainder;

import crm.dto.settings.request.store.remainder.RemainderSettingsUpsertRequest;
import crm.dto.settings.response.store.remainder.RemainderSettingsDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class RemainderSettingsServiceImpl implements RemainderSettingsService<RemainderSettingsDto> {
    @Override
    public Page<RemainderSettingsDto> findAll(Integer pageNumber, Integer pageSize) {
        return null;
    }

    @Override
    public RemainderSettingsDto findById(Long id) {
        return null;
    }

    @Override
    public RemainderSettingsDto save(RemainderSettingsUpsertRequest request) {
        return null;
    }

    @Override
    public RemainderSettingsDto updateById(Long id, RemainderSettingsUpsertRequest request) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

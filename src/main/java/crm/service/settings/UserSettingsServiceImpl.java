package crm.service.settings;

import crm.dto.settings.UserSettingsDto;
import crm.dto.settings.request.UserSettingsUpsertRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSettingsServiceImpl implements UserSettingsService<UserSettingsDto>{

    @Override
    public List<UserSettingsDto> findAll() {
        return null;
    }

    @Override
    public UserSettingsDto findById(Long id) {
        return null;
    }

    @Override
    public UserSettingsDto save(UserSettingsUpsertRequest request) {
        return null;
    }

    @Override
    public UserSettingsDto updateById(Long id, UserSettingsUpsertRequest request) {
        return null;
    }

}

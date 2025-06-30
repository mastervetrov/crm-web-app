package crm.service.settings;

import crm.dto.settings.request.UserSettingsUpsertRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserSettingsService<UserSettingsDto> {

    List<UserSettingsDto> findAll();

    UserSettingsDto findById(Long id);

    UserSettingsDto save(UserSettingsUpsertRequest request);

    UserSettingsDto updateById(Long id, UserSettingsUpsertRequest request);

}

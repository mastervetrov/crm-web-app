package crm.service.settings;

import crm.request.settings.UserSettingsUpsertRequest;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Interface user settings determine methods required.
 * todo дополнить
 *
 * @see UserSettingsUpsertRequest
 * @param <UserSettingsDtoT> {@link crm.request.settings.UserSettingsDto}
 */
@Service
public interface UserSettingsService<UserSettingsDtoT> {

  /**
  * Find dto list {@link crm.request.settings.UserSettingsDto}.
  *
  * @return dto list
  */
  List<UserSettingsDtoT> findAll();

  /**
  * Find dto {@link crm.request.settings.UserSettingsDto} by id .
  *
  * @return dto instance {@link crm.request.settings.UserSettingsDto}
  */
  UserSettingsDtoT findById(Long id);

  /**
  * Save request {@link UserSettingsUpsertRequest}.
  *
  * @return saved dto {@link crm.request.settings.UserSettingsDto}
  */
  UserSettingsDtoT save(UserSettingsUpsertRequest request);

  /**
  * Update request {@link UserSettingsUpsertRequest}.
  *
  * @return updatable dto {@link crm.request.settings.UserSettingsDto}
  */
  UserSettingsDtoT updateById(Long id, UserSettingsUpsertRequest request);

}

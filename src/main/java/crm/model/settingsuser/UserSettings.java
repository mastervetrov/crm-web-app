package crm.model.settingsuser;

import crm.model.settingsuser.store.remainder.RemainderSettings;
import crm.request.settingsuser.UserSettingsRequest;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity user settings.
 * Contains user settings.
 *
 * @see crm.service.settingsuser.UserSettingsService
 * @see crm.request.settingsuser.UserSettingsDto
 * @see UserSettingsRequest
 * @see crm.mapper.settingsuser.UserSettingsMapper
 * @see crm.repository.settingsuser.store.UserSettingsRepository
 */
@Getter
@Setter
@Entity
@Table(name = "user_settings")
public class UserSettings {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "remainder_settings_id")
  private RemainderSettings remainderSettings;

  @Override
  public String toString() {
    return "UserSettings{"
            + "id=" + id
            + ", remainderSettings="
            + remainderSettings + '}';
  }
}

package crm.model.settings;

import crm.model.settings.store.remainder.RemainderSettings;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Setter;

/**
 * Entity user settings.
 * Contains user settings.
 *
 * @see crm.service.settings.UserSettingsService
 * @see crm.request.settings.UserSettingsDto
 * @see crm.request.settings.UserSettingsUpsertRequest
 * @see crm.mapper.settings.UserSettingsMapper
 * @see crm.repository.settings.store.UserSettingsRepository
 */
@Entity
@Table(name = "user_settings")
@Setter
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

package crm.model.settings.store.remainder;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity remainder settings.
 * Contains remainder settings data.
 *
 * @see crm.dto.settings.remainder.RemainderSettingsDto
 * @see crm.request.settings.store.remainder.RemainderSettingsUpsertRequest
 * @see crm.repository.settings.store.remainder.RemainderSettingsRepository
 * @see crm.service.settings.store.remainder.RemainderSettingsSvc
 */
@Entity
@Table(name = "remainder_settings")
@Getter
@Setter
public class RemainderSettings {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "remainderSettings", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<RemainderField> displayedRemainderFieldList;

  @Override
  public String toString() {
    return "RemainderSettings{"
            + "id=" + id
            + ", displayedRemainderFieldList=" + displayedRemainderFieldList
            + '}';
  }
}

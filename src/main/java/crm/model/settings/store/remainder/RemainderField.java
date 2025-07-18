package crm.model.settings.store.remainder;

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
 * Entity remainder field.
 * Contains remainder field with parameters.
 *
 * @see crm.request.settings.store.remainder.RemainderFieldUpsertRequest
 * @see crm.dto.settings.remainder.RemainderFieldDto
 * @see crm.repository.settings.store.remainder.FieldRemainderRepository
 */
@Entity
@Table(name = "displayed_remainder_field")
@Getter
@Setter
public class RemainderField {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "name", nullable = false, unique = true)
  private String name;
  @Column(name = "label", nullable = false, unique = true)
  private String label;
  @Column(name = "isVisible", nullable = false)
  private boolean isVisible;
  @Column(name = "isRequire", nullable = false)
  private boolean isRequire;
  @Column(name = "orderField", unique = true)
  private Integer orderField;
  @ManyToOne
  @JoinColumn(name = "remainder_settings_id")
  private RemainderSettings remainderSettings;

  @Override
  public String toString() {
    return "DisplayedRemainderField{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", label='" + label + '\''
        + ", isVisible=" + isVisible
        + ", isRequire=" + isRequire
        + ", orderField=" + orderField
        + ", remainderSettings=" + remainderSettings
        + '}';
  }
}

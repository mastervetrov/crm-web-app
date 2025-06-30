package crm.model.settings.store.remainder;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "remainder_settings")
@Getter
@Setter
public class RemainderSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "remainderSettings")
    private List<DisplayedRemainderField> displayedRemainderFieldList;
}

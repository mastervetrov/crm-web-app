package crm.model.settings.store.remainder;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "displayed_remainder_field")
@Getter
@Setter
public class DisplayedRemainderField {
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
    @Column(name = "order")
    private Integer order;
}

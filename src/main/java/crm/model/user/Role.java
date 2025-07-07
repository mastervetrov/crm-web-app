package crm.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity role.
 * Contains role data.
 * todo дополнить
 */
@Entity
@Table(name = "role")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "name", nullable = false, unique = true)
  private String name;
  @Column(name = "description", nullable = false)
  private String description;
  @Column(name = "is_active")
  private Boolean isActive = true;
  //  private Set<User> users;
}

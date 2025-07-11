package crm.model.user;

import crm.model.settingsuser.UserSettings;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 * Entity role.
 * Contains user crm data.
 * todo дополнить
 */
@Entity
@Table(name = "user_crm")
public class UserCrm {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "first_name", nullable = false)
  private String firstName;
  @Column(name = "last_name", nullable = false)
  private String lastName;
  @Column(name = "middle_name")
  private String middleName;
  @Column(name = "email", nullable = false)
  private String email;
  @Column(name = "phone_number")
  private String phoneNumber;
  @Column(name = "date_of_birth", nullable = false)
  private LocalDateTime dateOfBirth;
  @Column(name = "username")
  private String username;
  @Column(name = "password_hash")
  private String passwordHash;
  @Column(name = "is_active", nullable = false)
  private Boolean isActive = true;
  @Column(name = "is_deleted", nullable = false)
  private Boolean isDeleted = false;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_settings_id", referencedColumnName = "id")
  private UserSettings userSettings;

//  @Column(name = "", nullable = false)
//  private String address;
//  @Column(name = "", nullable = false)
//  private String companyName;
//  @Column(name = "", nullable = false)
//  private LocalDateTime createdAt;
//  @Column(name = "", nullable = false)
//  private LocalDateTime updatedAt;

  // private Set<Role> roles;
}

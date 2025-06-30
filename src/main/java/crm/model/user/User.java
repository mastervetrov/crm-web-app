package crm.model.user;

import jakarta.persistence.*;
import crm.model.settings.UserSettings;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User {
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

//    @Column(name = "", nullable = false)
//    private String address;
//    @Column(name = "", nullable = false)
//    private String companyName;
//    @Column(name = "", nullable = false)
//    private LocalDateTime createdAt;
//    @Column(name = "", nullable = false)
//    private LocalDateTime updatedAt;

    // private Set<Role> roles;
}

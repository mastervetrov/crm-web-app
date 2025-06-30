package crm.model.settings;

import jakarta.persistence.*;
import crm.model.settings.store.remainder.RemainderSettings;


//Таблица с настройками CRM, которая содержит все параметры, настраиваемые пользователем
@Entity
@Table(name = "user_settings")
public class UserSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "remainder_settings_id")
    private RemainderSettings remainderSettings;
}

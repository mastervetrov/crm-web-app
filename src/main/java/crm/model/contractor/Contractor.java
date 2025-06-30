package crm.model.contractor;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "contractor")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "contractor_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Contractor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<String> phoneNumberList;
    private String email;
    private String address;
    private String note;
    private boolean isProvider;
    private boolean isPayer;

    //    private AdvertisingSource advertisingSource;  источник рекламы
    //    private User user;                            ответственное лицо

}

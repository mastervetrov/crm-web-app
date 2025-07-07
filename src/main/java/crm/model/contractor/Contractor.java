package crm.model.contractor;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import java.util.List;

/**
 * Entity contractor.
 * Contains contractor data.
 * Child tables: {@link CompanyContractor} and {@link PrivateContractor}
 */
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
  //  private AdvertisingSource advertisingSource;  источник рекламы
  //  private User user;              ответственное лицо
}

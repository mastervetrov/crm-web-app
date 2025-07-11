package crm.model.settings.general;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity company.
 * Contains company settings.
 *
 * @see crm.repository.settings.general.CompanyRepository
 * @see crm.service.settings.general.CompanyService
 * @see crm.mapper.settings.general.CompanyMapper
 * @see crm.dto.settings.general.CompanyDto
 * @see crm.request.settings.general.CompanyRequest
 */
@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String inn;

  private String kpp;

  private String ogrn;

  private String address;

  private String email;

  private String phone;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "currency_id")
  private Currency currency;

  private boolean supportAccess;

  private String comment;

}

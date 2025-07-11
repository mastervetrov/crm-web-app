package crm.model.settings.general;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity currency.
 * Contains currency for {@link Company}
 *
 * @see crm.repository.settings.general.CurrencyRepository
 * @see crm.service.settings.general.CurrencyService
 * @see crm.mapper.settings.general.CurrencyMapper
 * @see crm.dto.settings.general.CurrencyDto
 * @see crm.request.settings.general.CompanyRequest
 */
@Getter
@Setter
@Entity
@Table(name = "currency")
public class Currency {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String value;

}

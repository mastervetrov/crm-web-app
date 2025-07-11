package crm.request.settings.general;

import crm.model.settings.general.Currency;
import lombok.Data;

/**
 * Request - contains company fields.
 * Used for update and create company.
 * todo supplement to the javadoc controller
 *
 * @see crm.service.location.LocationService
 */
@Data
public class CompanyRequest {

  private String name;

  private String inn;

  private String kpp;

  private String ogrn;

  private String address;

  private String email;

  private String phone;

  private Currency currency;

  private boolean supportAccess;

  private String comment;
}

package crm.request.settings.general;

import lombok.Data;

/**
 * Request - contains currency fields.
 * Used for update and create currency
 * todo supplement to the javadoc controller
 *
 * @see crm.service.settings.general.CurrencyService
 */
@Data
public class CurrencyRequest {

  private String name;

  private String value;
}

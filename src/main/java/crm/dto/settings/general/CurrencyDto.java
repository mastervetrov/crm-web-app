package crm.dto.settings.general;

import lombok.Data;

/**
 * Response DTO, contains parameters table "currency".
 * Used for company settings return.
 *
 * @see crm.model.settings.general.Currency
 * @see crm.request.settings.general.CurrencyRequest
 * @see crm.mapper.settings.general.CurrencyMapper
 * @see crm.service.settings.general.CurrencyService
 */
@Data
public class CurrencyDto {

  private Long id;

  private String name;

  private String value;

}

package crm.dto.settings.general;

import lombok.Data;

/**
 * Response DTO, contains parameters table "company".
 * Used for company settings return.
 *
 * @see crm.model.settings.general.Company
 * @see crm.request.settings.general.CompanyRequest
 * @see crm.model.contractor.CompanyContractor
 * @see crm.controller.thymeleaf.ajax.settings.company.CompanyAjaxController
 * @see crm.service.settings.general.CompanyService
 */
@Data
public class CompanyDto {

  private Long id;

  private String name;

  private String inn;

  private String kpp;

  private String ogrn;

  private String address;

  private String email;

  private String phone;

  private CurrencyDto currency;

  private boolean supportAccess;

  private String comment;

}

package crm.dto.settingsuser.remainder;

import crm.model.settingsuser.store.remainder.RemainderField;
import crm.request.settingsuser.store.remainder.RemainderFieldRequest;
import crm.startup.settingsuser.store.remainder.RemainderFieldInitializer;
import lombok.Data;

/**
 * Response DTO, contains parameters table "remainders".
 * Used:
 * 1) for initialize default settings remainders
 * 2) for selective return data to the ProductService and RemainderController
 *
 * @see RemainderFieldInitializer
 * @see RemainderField
 * @see RemainderFieldRequest
 * @see crm.controller.thymeleaf.html.store.remainder.RemainderController
 * @see crm.controller.thymeleaf.ajax.store.remainder.RemainderAjaxController
 * @see Productservice
 */
@Data
public class RemainderFieldDto {

  private Long id;

  private String name;

  private String label;

  private boolean isVisible;

  private boolean isRequire;

  private Integer orderField;

}

package crm.dto.settings.remainder;

import crm.model.settings.store.remainder.RemainderField;
import crm.request.settings.store.remainder.RemainderFieldUpsertRequest;
import crm.service.product.ProductSvc;
import crm.startup.settings.store.remainder.RemainderFieldInitializer;
import lombok.Data;

/**
 * Response DTO, contains parameters table "remainders".
 * Used:
 * 1) for initialize default settings remainders
 * 2) for selective return data to the ProductService and RemainderController
 *
 * @see RemainderFieldInitializer
 * @see RemainderField
 * @see RemainderFieldUpsertRequest
 * @see crm.controller.thymeleaf.html.store.remainder.RemainderController
 * @see crm.controller.thymeleaf.ajax.store.remainder.RemainderAjaxController
 * @see ProductSvc
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

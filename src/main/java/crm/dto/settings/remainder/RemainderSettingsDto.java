package crm.dto.settings.remainder;

import crm.service.product.ProductSvc;
import crm.service.settings.store.remainder.RemainderSettingsSvc;
import java.util.List;
import lombok.Data;

/**
 * Response DTO, contains remainders settings.
 * Used for transmissions to the RemainderService
 *
 * @see crm.model.settings.store.remainder.RemainderSettings
 * @see crm.request.settings.store.remainder.RemainderSettingsUpsertRequest
 * @see RemainderSettingsSvc
 */
@Data
public class RemainderSettingsDto {

  private Long id;

  /**
  * List of fields displayed in the table remainders.
  * Used for selective data return to the ProductService and RemainderController
  *
  * @see ProductSvc
  * @see crm.controller.thymeleaf.html.store.remainder.RemainderController
  */
  private List<RemainderFieldDto> displayedRemainderFieldList;

}

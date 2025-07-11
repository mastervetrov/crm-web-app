package crm.dto.settingsuser.remainder;

import crm.request.settingsuser.store.remainder.RemainderSettingsRequest;
import java.util.List;
import lombok.Data;

/**
 * Response DTO, contains remainders settings.
 * Used for transmissions to the RemainderService
 *
 * @see crm.model.settingsuser.store.remainder.RemainderSettings
 * @see RemainderSettingsRequest
 * @see crm.service.settingsuser.store.remainder.RemainderSettingsService
 */
@Data
public class RemainderSettingsDto {

  private Long id;

  /**
  * List of fields displayed in the table remainders.
  * Used for selective data return to the ProductService and RemainderController
  *
  * @see crm.service.product.ProductService
  * @see crm.controller.thymeleaf.html.store.remainder.RemainderController
  */
  private List<RemainderFieldDto> displayedRemainderFieldList;

}

package crm.dto.store;

import lombok.Data;

/**
 * Response DTO - contains data store.
 * Used for return in controller.
 *
 * @see crm.controller.thymeleaf.html.store.StoreController
 * @see crm.controller.thymeleaf.ajax.store.StoreAjaxController
 */
@Data
public class StoreDto {

  private Long id;

  private String name;

}

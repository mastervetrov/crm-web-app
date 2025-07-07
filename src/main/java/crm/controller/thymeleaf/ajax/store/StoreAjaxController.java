package crm.controller.thymeleaf.ajax.store;

import crm.controller.thymeleaf.ajax.BaseAjaxController;
import crm.controller.thymeleaf.ajax.BaseUrlAjax;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns html fragments.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/ajax/store")
@BaseUrlAjax("/crm/web-app/store/")
public class StoreAjaxController extends BaseAjaxController {

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/settings")
  private String loadStoreSettings() {
    return getDivByClassName("settings", "store-settings-panel");
  }

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/moves")
  private String loadStoreMoves() {
    return getDivByClassName("moves", "store-moves-panel");
  }

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/inventory")
  private String loadStoreInventory() {
    return getDivByClassName("inventory", "store-inventory-panel");
  }

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/cancellations")
  private String loadStoreCancellations() {
    return getDivByClassName("cancellations", "store-cancellations-panel");
  }

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/returns/purchase")
  private String loadStoreReturnsPurchase() {
    return getDivByClassName("returns/purchase", "store-returns-purchase-panel");
  }

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/returns/sales")
  private String loadStoreReturnsSales() {
    return getDivByClassName("returns/sales", "store-returns-sales-panel");
  }
}

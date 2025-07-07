package crm.controller.thymeleaf.html.store;

import crm.controller.thymeleaf.html.BaseHtmlController;
import crm.controller.thymeleaf.html.BaseUrl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/store")
@BaseUrl("/crm/web-app/store/")
@Slf4j
public class StoreController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "settings.html"
  */
  @GetMapping("/settings")
  private String showStoreSettings() {
    return getHtml("settings");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "moves.html"
  */
  @GetMapping("/moves")
  private String showStoreMoves() {
    return getHtml("moves");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "inventory.html"
  */
  @GetMapping("/inventory")
  private String showStoreInventory() {
    return getHtml("inventory");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "cancellations.html"
  */
  @GetMapping("/cancellations")
  private String showStoreCancellations() {
    return getHtml("cancellations");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/returns/purchase.html"
  */
  @GetMapping("/returns/purchase")
  private String showStoreReturnsPurchase() {
    return getHtml("returns/purchase");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/returns/sales.html"
  */
  @GetMapping("/returns/sales")
  private String showStoreReturnsSales() {
    return getHtml("returns/sales");
  }
}

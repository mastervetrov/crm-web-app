package crm.controller.thymeleaf.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/ajax")
@BaseUrlAjax("/crm/web-app/")
public class MainAjaxController extends BaseAjaxController {

  @GetMapping("/main")
  private String loadMain() {
    return getDivByClassName("main", "main-panel");
  }

  @GetMapping("/orders")
  private String loadOrders() {
    return getDivByClassName("orders", "orders-panel");
  }

  @GetMapping("/sales")
  private String loadSales() {
    return getDivByClassName("sales", "sales-panel");
  }

  @GetMapping("/settings")
  private String loadSettings() {
    return getDivByIdName("settings", "panelContent");
  }
}

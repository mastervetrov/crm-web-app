package crm.controller.thymeleaf.html.orders;

import crm.controller.thymeleaf.html.BaseHtmlController;
import crm.controller.thymeleaf.html.BaseUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/orders")
@BaseUrl("/crm/web-app/")
public class OrdersController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "orders.html"
  */
  @GetMapping("")
  public String showOrders() {
    return getHtml("orders");
  }
}

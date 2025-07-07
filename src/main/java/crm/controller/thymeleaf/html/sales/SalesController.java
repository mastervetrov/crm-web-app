package crm.controller.thymeleaf.html.sales;

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
@RequestMapping("/crm/web-app/sales")
@BaseUrl("/crm/web-app/")
public class SalesController extends BaseHtmlController {
  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "sales.html"
  */
  @GetMapping("")
  public String showSales() {
    return getHtml("sales");
  }

}

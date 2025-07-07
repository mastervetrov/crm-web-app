package crm.controller.thymeleaf.html.analytics;

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
@RequestMapping("/crm/web-app/analytics")
@BaseUrl("/crm/web-app/analytics/")
public class AnalyticsController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "calls.html"
  */
  @GetMapping("/calls")
  private String showAnalyticsCalls() {
    return getHtml("calls");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "advertising.html"
  */
  @GetMapping("/advertising")
  private String showAnalyticsAdvertising() {
    return getHtml("advertising");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "balance.html"
  */
  @GetMapping("/reports/balance")
  private String showAnalyticsReportsBalance() {
    return getHtml("reports/balance");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "reports/nomenclatures.html"
  */
  @GetMapping("/reports/nomenclatures")
  private String showAnalyticsReportsNomenclatures() {
    return getHtml("reports/nomenclatures");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "reports/orders.html"
  */
  @GetMapping("/reports/orders")
  private String showAnalyticsReportsOrders() {
    return getHtml("reports/orders");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "reports/orders-times-control.html"
  */
  @GetMapping("/reports/orders-time-control")
  private String showAnalyticsReportsOrdersTimeControl() {
    return getHtml("reports/orders-time-control");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "reports/sales.html"
  */
  @GetMapping("/reports/sales")
  private String showAnalyticsReportsSales() {
    return getHtml("reports/sales");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "reports/verification.html"
  */
  @GetMapping("/reports/verification")
  private String showAnalyticsReportsVerification() {
    return getHtml("reports/verification");
  }
}

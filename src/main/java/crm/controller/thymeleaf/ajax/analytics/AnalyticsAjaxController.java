package crm.controller.thymeleaf.ajax.analytics;

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
@RequestMapping("/crm/web-app/ajax/analytics")
@BaseUrlAjax("/crm/web-app/analytics/")
public class AnalyticsAjaxController extends BaseAjaxController {

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "calls.html"
  */
  @GetMapping("/calls")
  private String loadAnalyticsCalls() {
    return getDivByClassName("calls", "analytics-calls-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "advertising.html"
  */
  @GetMapping("/advertising")
  private String loadAnalyticsAdvertising() {
    return getDivByClassName("advertising", "analytics-advertising-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/reports/balance.html"
  */
  @GetMapping("/reports/balance")
  private String loadAnalyticsReportsBalance() {
    return getDivByClassName("reports/balance", "analytics-reports-balance-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/reports/nomenclatures.html"
  */
  @GetMapping("/reports/nomenclatures")
  private String loadAnalyticsReportsNomenclatures() {
    return getDivByClassName("reports/nomenclatures", "analytics-reports-nomenclatures-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/reports/orders.html"
  */
  @GetMapping("/reports/orders")
  private String loadAnalyticsReportsOrders() {
    return getDivByClassName("reports/orders", "analytics-reports-orders-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/reports/orders-time-control.html"
  */
  @GetMapping("/reports/orders-time-control")
  private String loadAnalyticsReportsOrdersTimeControl() {
    String pathHtml = "reports/orders-time-control";
    String className = "analytics-reports-orders-time-control-panel";
    return getDivByClassName(pathHtml, className);
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/reports/sales.html"
  */
  @GetMapping("/reports/sales")
  private String loadAnalyticsReportsSales() {
    return getDivByClassName("reports/sales", "analytics-reports-sales-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/reports/verification.html"
  */
  @GetMapping("/reports/verification")
  private String loadAnalyticsReportsVerification() {
    return getDivByClassName("reports/verification", "analytics-reports-verification-panel");
  }
}

package crm.controller.ajax.analytics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/analytics")
public class AnalyticsAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/analytics/" + subPath;
    }
    @GetMapping("/calls")
    private String loadAnalyticsCalls() {
        return getTemplatePath("calls :: div.analytics-calls-panel");
    }
    @GetMapping("/advertising")
    private String loadAnalyticsAdvertising() {
        return getTemplatePath("advertising :: div.analytics-advertising-panel");
    }
    @GetMapping("/reports/balance")
    private String loadAnalyticsReportsBalance() {
        return getTemplatePath("reports/balance :: div.analytics-reports-balance-panel");
    }
    @GetMapping("/reports/nomenclatures")
    private String loadAnalyticsReportsNomenclatures() {
        return getTemplatePath("reports/nomenclatures :: div.analytics-reports-nomenclatures-panel");
    }
    @GetMapping("/reports/orders")
    private String loadAnalyticsReportsOrders() {
        return getTemplatePath("reports/orders :: div.analytics-reports-orders-panel");
    }
    @GetMapping("/reports/orders-time-control")
    private String loadAnalyticsReportsOrdersTimeControl() {
        return getTemplatePath("reports/orders-time-control :: div.analytics-reports-orders-time-control-panel");
    }
    @GetMapping("/reports/sales")
    private String loadAnalyticsReportsSales() {
        return getTemplatePath("reports/sales :: div.analytics-reports-sales-panel");
    }
    @GetMapping("/reports/verification")
    private String loadAnalyticsReportsVerification() {
        return getTemplatePath("reports/verification :: div.analytics-reports-verification-panel");
    }
}

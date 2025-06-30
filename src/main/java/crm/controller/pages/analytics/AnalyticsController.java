package crm.controller.pages.analytics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/analytics")
public class AnalyticsController {
    private String getTemplatePath(String subPath) {
        return "/crm/web-app/analytics/" + subPath;
    }

    @GetMapping("/calls")
    private String showAnalyticsCalls() {
        return getTemplatePath("calls");
    }

    @GetMapping("/advertising")
    private String showAnalyticsAdvertising() {
        return getTemplatePath("advertising");
    }
    @GetMapping("/reports/balance")
    private String showAnalyticsReportsBalance() {
        return getTemplatePath("reports/balance");
    }

    @GetMapping("/reports/nomenclatures")
    private String showAnalyticsReportsNomenclatures() {
        return getTemplatePath("reports/nomenclatures");
    }

    @GetMapping("/reports/orders")
    private String showAnalyticsReportsOrders() {
        return getTemplatePath("reports/orders");
    }

    @GetMapping("/reports/orders-time-control")
    private String showAnalyticsReportsOrdersTimeControl() {
        return getTemplatePath("reports/orders-time-control");
    }

    @GetMapping("/reports/sales")
    private String showAnalyticsReportsSales() {
        return getTemplatePath("reports/sales");
    }

    @GetMapping("/reports/verification")
    private String showAnalyticsReportsVerification() {
        return getTemplatePath("reports/verification");
    }
}

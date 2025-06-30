package crm.controller.pages.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/finance/")
public class FinanceController {
    private String getTemplatePath(String subPath) {
        return "/crm/web-app/finance/" + subPath;
    }
    @GetMapping("/transactions")
    private String showFinanceTransactions() {
        return getTemplatePath("transactions");
    }

    @GetMapping("/salaries")
    private String showFinanceSalaries() {
        return getTemplatePath("salaries");
    }

    @GetMapping("/invoices")
    private String showFinanceInvoices() {
        return getTemplatePath("invoices");
    }

    @GetMapping("/cashes")
    private String showFinanceCashes() {
        return getTemplatePath("cashes");
    }

    @GetMapping("/salaries/settings")
    private String showFinanceSalariesSettings() {
        return getTemplatePath("salaries/settings");
    }

    @GetMapping("/salaries/statistic")
    private String showFinanceSalariesStatistic() {
        return getTemplatePath("salaries/statistic");
    }
}

package crm.controller.ajax.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/finance")
public class FinanceAjaxController {

    private String getTemplatePath(String subPath) {
        return "crm/web-app/finance/" + subPath;
    }
    @GetMapping("/transactions")
    private String loadFinanceTransactions() {
        return getTemplatePath("transactions :: div.finance-transactions-panel");
    }
    @GetMapping("/salaries")
    private String loadFinanceSalaries() {
        return getTemplatePath("salaries :: div.finance-salaries-panel");
    }
    @GetMapping("/invoices")
    private String loadFinanceInvoices() {
        return getTemplatePath("invoices :: div.finance-invoices-panel");
    }
    @GetMapping("/cashes")
    private String loadFinanceCashes() {
        return getTemplatePath("cashes :: div.finance-cashes-panel");
    }
    @GetMapping("/salaries/settings")
    private String loadFinanceSalariesSettings() {
        return getTemplatePath("salaries/settings :: div.finance-salaries-settings-panel");
    }
    @GetMapping("/salaries/statistic")
    private String loadFinanceSalariesStatistic() {
        return getTemplatePath("statistic :: div.finance-salaries-statistic-panel");
    }
}

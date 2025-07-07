package crm.controller.thymeleaf.ajax.finance;

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
@RequestMapping("/crm/web-app/ajax/finance")
@BaseUrlAjax("/crm/web-app/finance/")
public class FinanceAjaxController extends BaseAjaxController {


  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "transactions.html"
  */
  @GetMapping("/transactions")
  private String loadFinanceTransactions() {
    return getDivByClassName("transactions", "finance-transactions-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "salaries.html"
  */
  @GetMapping("/salaries")
  private String loadFinanceSalaries() {
    return getDivByClassName("salaries", "finance-salaries-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "invoices.html"
  */
  @GetMapping("/invoices")
  private String loadFinanceInvoices() {
    return getDivByClassName("invoices", "finance-invoices-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "cashes.html"
  */
  @GetMapping("/cashes")
  private String loadFinanceCashes() {
    return getDivByClassName("cashes", "finance-cashes-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "salaries.html"
  */
  @GetMapping("/salaries/settings")
  private String loadFinanceSalariesSettings() {
    return getDivByClassName("salaries/settings", "finance-salaries-settings-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "salaries.html"
  */
  @GetMapping("/salaries/statistic")
  private String loadFinanceSalariesStatistic() {
    return getDivByClassName("statistic", "finance-salaries-statistic-panel");
  }
}

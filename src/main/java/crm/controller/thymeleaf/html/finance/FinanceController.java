package crm.controller.thymeleaf.html.finance;

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
@RequestMapping("/crm/web-app/finance/")
@BaseUrl("/crm/web-app/finance/")
public class FinanceController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "transactions.html"
  */
  @GetMapping("/transactions")
  private String showFinanceTransactions() {
    return getHtml("transactions");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "salaries.html"
  */
  @GetMapping("/salaries")
  private String showFinanceSalaries() {
    return getHtml("salaries");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "invoices.html"
  */
  @GetMapping("/invoices")
  private String showFinanceInvoices() {
    return getHtml("invoices");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "cashes.html"
  */
  @GetMapping("/cashes")
  private String showFinanceCashes() {
    return getHtml("cashes");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/salaries/settings.html"
  */
  @GetMapping("/salaries/settings")
  private String showFinanceSalariesSettings() {
    return getHtml("salaries/settings");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/salaries/statistic.html"
  */
  @GetMapping("/salaries/statistic")
  private String showFinanceSalariesStatistic() {
    return getHtml("salaries/statistic");
  }
}

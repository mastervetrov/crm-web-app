package crm.controller.thymeleaf.ajax.store.receipt;

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
@RequestMapping("/crm/web-app/ajax/store/receipt")
@BaseUrlAjax("crm/web-app/store/")
public class ReceiptAjaxController extends BaseAjaxController {

    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("")
  private String loadStoreReceipt() {
    return getDivByClassName("receipt", "store-receipt-panel");
  }
}

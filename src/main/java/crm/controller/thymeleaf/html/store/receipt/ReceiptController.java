package crm.controller.thymeleaf.html.store.receipt;

import crm.controller.thymeleaf.html.BaseHtmlController;
import crm.controller.thymeleaf.html.BaseUrl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/store/receipt")
@BaseUrl("/crm/web-app/store/")
@Slf4j
public class ReceiptController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "receipt.html"
  */
  @GetMapping("")
  private String showStoreReceipt() {
    return getHtml("receipt");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "receipt/new.html"
  */
  @GetMapping("/new")
  private String showStoreReceiptNew(Model model) {
    return getHtml("receipt/new");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "receipt/new.html"
  */
  @GetMapping("/{id}")
  private String showStoreReceiptNew(Model model, @PathVariable Long id) {
    return getHtml("receipt/new");
  }
}

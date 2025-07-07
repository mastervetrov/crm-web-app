package crm.controller.thymeleaf.ajax.store.remainder;

import crm.controller.thymeleaf.ajax.BaseAjaxController;
import crm.controller.thymeleaf.ajax.BaseUrlAjax;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns html fragments..
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/ajax/store/remainder")
@BaseUrlAjax("crm/web-app/store/")
@Slf4j
public class RemainderAjaxController extends BaseAjaxController {
    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("")
  private String loadStoreRemainder(Model model) {
    return getDivByClassName("remainder", "store-remainder-panel");
  }
}

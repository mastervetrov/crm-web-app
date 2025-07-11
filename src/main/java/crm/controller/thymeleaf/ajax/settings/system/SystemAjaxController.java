package crm.controller.thymeleaf.ajax.settings.system;

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
@RequestMapping("/crm/web-app/ajax/settings/system")
@BaseUrlAjax("/crm/web-app/settings/system/")
public class SystemAjaxController extends BaseAjaxController {

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "prices.html"
  */
  @GetMapping("/prices")
  private String loadSettingsPrices() {
    return getDivByIdName("prices", "settingsSystemPricesContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/statuses/statuses.html"
  */
  @GetMapping("/statuses/statuses")
  private String loadSettingsStatuses() {
    return getDivByIdName("statuses/statuses", "settingsSystemStatusesStatusesContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "form-editor.html"
  */
  @GetMapping("/form-editor")
  private String loadSettingsFormEditor() {
    return getDivByIdName("form-editor", "settingsSystemFormEditorContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "template-editor.html"
  */
  @GetMapping("/template-editor")
  private String loadSettingsTemplateEditor() {
    return getDivByIdName("template-editor", "settingsSystemTemplateEditorContent");
  }
}

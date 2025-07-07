package crm.controller.thymeleaf.html.settings.system;

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
@RequestMapping("/crm/web-app/settings/system")
@BaseUrl("/crm/web-app/settings/system/")
public class SystemController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "prices.html"
  */
  @GetMapping("/prices")
  private String showSettingsPrices() {
    return getHtml("prices");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/statuses/statuses.html"
  */
  @GetMapping("/statuses/statuses")
  private String showSettingsStatuses() {
    return getHtml("statuses/statuses");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "form-editor.html"
  */
  @GetMapping("/form-editor")
  private String showSettingsFormEditor() {
    return getHtml("form-editor");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "template-editor.html"
  */
  @GetMapping("/template-editor")
  private String showSettingsTemplateEditor() {
    return getHtml("template-editor");
  }
}

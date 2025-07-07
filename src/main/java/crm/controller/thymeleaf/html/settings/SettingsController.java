package crm.controller.thymeleaf.html.settings;

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
@RequestMapping("/crm/web-app/settings")
@BaseUrl("/crm/web-app/")
public class SettingsController extends BaseHtmlController {

  /**
  * Method of rendering site page via thymeleaf.
  *
  * @return "settings.html"
  */
  @GetMapping("")
  private String showSettings() {
    return getHtml("settings");
  }
}

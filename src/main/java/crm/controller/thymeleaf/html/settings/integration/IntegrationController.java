package crm.controller.thymeleaf.html.settings.integration;

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
@RequestMapping("/crm/web-app/settings/integration")
@BaseUrl("/crm/web-app/settings/integration/")
public class IntegrationController extends BaseHtmlController {
  
  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "api.html"
  */
  @GetMapping("/api")
  private String showSettingsApi() {
    return getHtml("api");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "webhook.html"
  */
  @GetMapping("/webhook")
  private String showSettingsWebhook() {
    return getHtml("webhook");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "widget.html"
  */
  @GetMapping("/widget")
  private String showSettingsWidget() {
    return getHtml("widget");
  }
}

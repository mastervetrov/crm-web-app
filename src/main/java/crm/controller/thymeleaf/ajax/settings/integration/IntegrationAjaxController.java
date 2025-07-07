package crm.controller.thymeleaf.ajax.settings.integration;

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
@RequestMapping("/crm/web-app/ajax/settings/integration")
@BaseUrlAjax("/crm/web-app/settings/integration/")
public class IntegrationAjaxController extends BaseAjaxController {
    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "api.html"
  */
  @GetMapping("/api")
  private String showSettingsApi() {
    return getDivByClassName("api", "settingsIntegrationApiContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "webhook.html"
  */
  @GetMapping("/webhook")
  private String showSettingsWebhook() {
    return getDivByClassName("webhook", "settingsIntegrationWebhookContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "widget.html"
  */
  @GetMapping("/widget")
  private String showSettingsWidget() {
    return getDivByClassName("widget", "settingsIntegrationWidgetContent");
  }

}

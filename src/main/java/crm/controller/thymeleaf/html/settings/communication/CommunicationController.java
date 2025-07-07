package crm.controller.thymeleaf.html.settings.communication;

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
@RequestMapping("/crm/web-app/settings/communication")
@BaseUrl("/crm/web-app/settings/communication/")
public class CommunicationController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/notifications/employees.html"
  */  @GetMapping("/notifications/employees")
  private String showSettingsNotificationsEmployees() {
    return getHtml("notifications/employees");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/notifications/clients.html"
  */
  @GetMapping("/notifications/clients")
  private String showSettingsNotificationsClients() {
    return getHtml("notifications/clients");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/notifications/domain.html"
  */
  @GetMapping("/notifications/domain")
  private String showSettingsNotificationsDomain() {
    return getHtml("notifications/domain");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "sms.html"
  */
  @GetMapping("/sms")
  private String showSettingsSms() {
    return getHtml("sms");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "telephony.html"
  */
  @GetMapping("/telephony")
  private String showSettingsTelephony() {
    return getHtml("telephony");
  }
}

package crm.controller.thymeleaf.ajax.settings.communication;

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
@RequestMapping("/crm/web-app/ajax/settings/communication/")
@BaseUrlAjax("/crm/web-app/settings/communication/")
public class CommunicationAjaxController extends BaseAjaxController {

  // ---------NOTIFICATIONS---------
    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/notifications/employees.html"
  */
  @GetMapping("/notifications/employees")
  private String showSettingsNotificationsEmployees() {
    return getDivByClassName("notifications/employees", "settingsNotificationsEmployeesContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/notifications/clients.html"
  */
  @GetMapping("/notifications/clients")
  private String showSettingsNotificationsClients() {
    return getDivByClassName("notifications/clients", "settingsNotificationsClientsContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/notifications/domain.html"
  */
  @GetMapping("/notifications/domain")
  private String showSettingsNotificationsDomain() {
    return getDivByClassName("notifications/domain", "settingsNotificationsDomainContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "sms.html"
  */
  @GetMapping("/sms")
  private String showSettingsSms() {
    return getDivByClassName("sms", "settingsNotificationsSmsContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "telephony.html"
  */
  @GetMapping("/telephony")
  private String showSettingsTelephony() {
    return getDivByClassName("telephony", "settingsNotificationsTelephonyContent");
  }

}

package crm.controller.ajax.settings.communication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/settings/communication/")
public class CommunicationAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/settings/communication/" + subPath;
    }

    // ---------NOTIFICATIONS---------
    @GetMapping("/notifications/employees")
    private String showSettingsNotificationsEmployees() {
        return getTemplatePath("notifications/employees :: div#settingsNotificationsEmployeesContent");
    }

    @GetMapping("/notifications/clients")
    private String showSettingsNotificationsClients() {
        return getTemplatePath("notifications/clients :: div#settingsNotificationsClientsContent");
    }

    @GetMapping("/notifications/domain")
    private String showSettingsNotificationsDomain() {
        return getTemplatePath("notifications/domain :: div#settingsNotificationsDomainContent");
    }


    // ---------SMS---------
    @GetMapping("/sms")
    private String showSettingsSms() {
        return getTemplatePath("sms :: div#settingsNotificationsSmsContent");
    }


    // ---------TELEPHONY---------
    @GetMapping("/telephony")
    private String showSettingsTelephony() {
        return getTemplatePath("telephony :: div#settingsNotificationsTelephonyContent");
    }

}

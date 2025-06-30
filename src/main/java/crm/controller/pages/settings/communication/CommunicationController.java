package crm.controller.pages.settings.communication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/settings/communication")
public class CommunicationController {


    // ---------GENERAL---------
    @GetMapping("/notifications/employees")
    private String showSettingsNotificationsEmployees() {
        return "/crm/web-app/settings/communication/notifications/employees";
    }

    @GetMapping("/notifications/clients")
    private String showSettingsNotificationsClients() {
        return "/crm/web-app/settings/communication/notifications/clients";
    }

    @GetMapping("/notifications/domain")
    private String showSettingsNotificationsDomain() {
        return "/crm/web-app/settings/communication/notifications/domain";
    }


    // ---------GENERAL---------
    @GetMapping("/sms")
    private String showSettingsSms() {
        return "/crm/web-app/settings/communication/sms";
    }


    // ---------GENERAL---------
    @GetMapping("/telephony")
    private String showSettingsTelephony() {
        return "/crm/web-app/settings/communication/telephony";
    }


}

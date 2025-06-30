package crm.controller.pages.settings.integration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/settings/integration")
public class IntegrationController {

    @GetMapping("/api")
    private String showSettingsApi() {
        return "/crm/web-app/settings/integration/api";
    }

    @GetMapping("/webhook")
    private String showSettingsWebhook() {
        return "/crm/web-app/settings/integration/webhook";
    }

    @GetMapping("/widget")
    private String showSettingsWidget() {
        return "/crm/web-app/settings/integration/widget";
    }

}

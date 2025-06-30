package crm.controller.ajax.settings.integration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/settings/integration")
public class IntegrationAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/settings/integration/" + subPath;
    }
    @GetMapping("/api")
    private String showSettingsApi() {
        return getTemplatePath("api :: div#settingsIntegrationApiContent");
    }

    @GetMapping("/webhook")
    private String showSettingsWebhook() {
        return getTemplatePath("webhook :: div#settingsIntegrationWebhookContent");
    }

    @GetMapping("/widget")
    private String showSettingsWidget() {
        return getTemplatePath("widget :: div#settingsIntegrationWidgetContent");
    }

}

package crm.controller.pages.settings.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/settings/system")
public class SystemController {

    @GetMapping("/prices")
    private String showSettingsPrices() {
        return "/crm/web-app/settings/system/prices";
    }

    @GetMapping("/statuses/statuses")
    private String showSettingsStatuses() {
        return "/crm/web-app/settings/system/statuses/statuses";
    }

    @GetMapping("/form-editor")
    private String showSettingsFormEditor() {
        return "/crm/web-app/settings/system/form-editor";
    }

    @GetMapping("/template-editor")
    private String showSettingsTemplateEditor() {
        return "/crm/web-app/settings/system/template-editor";
    }

}

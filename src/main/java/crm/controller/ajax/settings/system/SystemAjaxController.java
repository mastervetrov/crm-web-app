package crm.controller.ajax.settings.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/settings/system")
public class SystemAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/settings/system/" + subPath;
    }

    @GetMapping("/prices")
    private String loadSettingsPrices() {
        return getTemplatePath("prices :: div#settingsSystemPricesContent");
    }

    @GetMapping("/statuses/statuses")
    private String loadSettingsStatuses() {
        return getTemplatePath("statuses/statuses :: div#settingsSystemStatusesStatusesContent");
    }

    @GetMapping("/form-editor")
    private String loadSettingsFormEditor() {
        return getTemplatePath("form-editor :: div#settingsSystemFormEditorContent");
    }

    @GetMapping("/template-editor")
    private String loadSettingsTemplateEditor() {
        return getTemplatePath("template-editor :: div#settingsSystemTemplateEditorContent");
    }

}

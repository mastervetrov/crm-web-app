package crm.controller.pages.settings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/settings")
public class SettingsController {

    @GetMapping("")
    private String showSettings() {
        return "/crm/web-app/settings";
    }
}

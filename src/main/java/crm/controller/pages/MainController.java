package crm.controller.pages;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app")
@Slf4j
public class MainController {

    @GetMapping("")
    public String showAdminPanel() {
        return "/crm/web-app/main";
    }

    @GetMapping("/main")
    public String showMain() {
        return "/crm/web-app/main";
    }

}

package crm.controller.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax")
public class MainAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/" + subPath;
    }

    @GetMapping("/main")
    private String loadMain() {
        return getTemplatePath("main :: div.main-panel");
    }

    @GetMapping("/orders")
    private String loadOrders() {
        return getTemplatePath("orders :: div.orders-panel");
    }

    @GetMapping("/sales")
    private String loadSales() {
        return getTemplatePath("sales :: div.sales-panel");
    }

    @GetMapping("/settings")
    private String loadSettings() {
        return getTemplatePath("settings :: div#panelContent");
    }
}

package crm.controller.pages.sales;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/sales")
public class SalesController {
    @GetMapping("")
    public String showSales () {
        return "/crm/web-app/sales";
    }
}

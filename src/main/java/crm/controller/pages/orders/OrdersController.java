package crm.controller.pages.orders;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/orders")
public class OrdersController {
    @GetMapping("")
    public String showOrders () {
        return "/crm/web-app/orders";
    }
}

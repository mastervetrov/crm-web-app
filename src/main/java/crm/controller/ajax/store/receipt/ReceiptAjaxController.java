package crm.controller.ajax.store.receipt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/store/receipt")
public class ReceiptAjaxController {

    @GetMapping("")
    private String loadStoreReceipt() {
        return "crm/web-app/store/receipt :: div.store-receipt-panel";
    }

}

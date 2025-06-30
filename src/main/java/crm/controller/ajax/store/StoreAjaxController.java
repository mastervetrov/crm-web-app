package crm.controller.ajax.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/store")
public class StoreAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/store/" + subPath;
    }

    @GetMapping("/settings")
    private String loadStoreSettings() {
        return getTemplatePath("settings :: div.store-settings-panel");
    }

    @GetMapping("/moves")
    private String loadStoreMoves() {
        return getTemplatePath("moves :: div.store-moves-panel");
    }

    @GetMapping("/inventory")
    private String loadStoreInventory() {
        return getTemplatePath("inventory :: div.store-inventory-panel");
    }

    @GetMapping("/cancellations")
    private String loadStoreCancellations() {
        return getTemplatePath("cancellations :: div.store-cancellations-panel");
    }

    @GetMapping("/returns/purchase")
    private String loadStoreReturnsPurchase() {
        return getTemplatePath("returns/purchase :: div.store-returns-purchase-panel");
    }

    @GetMapping("/returns/sales")
    private String loadStoreReturnsSales() {
        return getTemplatePath("returns/sales :: div.store-returns-sales-panel");
    }

}

package crm.controller.ajax.compendiums;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/compendiums")
public class CompendiumsAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/compendiums/" + subPath;
    }
    @GetMapping("/works")
    private String loadCompendiumsWorks() {
        return getTemplatePath("works :: div.compendiums-works-panel");
    }
    @GetMapping("/units")
    private String loadCompendiumsUnits() {
        return getTemplatePath("units :: div.compendiums-units-panel");
    }
    @GetMapping("/problems")
    private String loadCompendiumsProblems() {
        return getTemplatePath("problems :: div.compendiums-problems-panel");
    }
    @GetMapping("/nomenclatures")
    private String loadCompendiumsNomenclatures() {
        return getTemplatePath("nomenclatures :: div.compendiums-nomenclatures-panel");
    }
    @GetMapping("/devices")
    private String loadCompendiumsDevices() {
        return getTemplatePath("devices :: div.compendiums-devices-panel");
    }
    @GetMapping("/contractors")
    private String loadCompendiumsContractors() {
        return getTemplatePath("contractors :: div.compendiums-contractors-panel");
    }
    @GetMapping("/complete-sets")
    private String loadCompendiumsCompleteSets() {
        return getTemplatePath("complete-sets :: div.compendiums-complete-sets-panel");
    }
    @GetMapping("/cash-items/consumption")
    private String loadCompendiumsCashItemsConsumption() {
        return getTemplatePath("cash-items/consumption :: div.compendiums-cash-items-consumption-panel");
    }
    @GetMapping("/cash-items/income")
    private String loadCompendiumsCashItemIncome() {
        return getTemplatePath("cash-items/income :: div.compendiums-cash-items-income-panel");
    }

}

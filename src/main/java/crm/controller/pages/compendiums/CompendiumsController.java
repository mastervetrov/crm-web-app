package crm.controller.pages.compendiums;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/compendiums")
public class CompendiumsController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/compendiums/" + subPath;
    }

    @GetMapping("/works")
    private String showCompendiumsWorks() {
        return getTemplatePath("works");
    }

    @GetMapping("/units")
    private String showCompendiumsUnits() {
        return getTemplatePath("units");
    }

    @GetMapping("/problems")
    private String showCompendiumsProblems() {
        return getTemplatePath("problems");
    }

    @GetMapping("/nomenclatures")
    private String showCompendiumsNomenclatures() {
        return getTemplatePath("nomenclatures");
    }

    @GetMapping("/devices")
    private String showCompendiumsDevices() {
        return getTemplatePath("devices");
    }

    @GetMapping("/contractors")
    private String showCompendiumsContractors() {
        return getTemplatePath("contractors");
    }

    @GetMapping("/complete-sets")
    private String showCompendiumsCompleteSets() {
        return getTemplatePath("complete-sets");
    }

    @GetMapping("/cash-items/consumption")
    private String showCompendiumsCashItemsConsumption() {
        return getTemplatePath("cash-items/consumption");
    }

    @GetMapping("/cash-items/income")
    private String showCompendiumsCashItemIncome() {
        return getTemplatePath("cash-items/income");
    }
}

package crm.controller.thymeleaf.ajax.compendiums;

import crm.controller.thymeleaf.ajax.BaseAjaxController;
import crm.controller.thymeleaf.ajax.BaseUrlAjax;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns html fragments.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/ajax/compendiums")
@BaseUrlAjax("/crm/web-app/compendiums/")
public class CompendiumsAjaxController extends BaseAjaxController {

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "works.html"
  */
  @GetMapping("/works")
  private String loadCompendiumsWorks() {
    return getDivByClassName("works", "compendiums-works-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "units.html"
  */
  @GetMapping("/units")
  private String loadCompendiumsUnits() {
    return getDivByClassName("units", "compendiums-units-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "problems.html"
  */
  @GetMapping("/problems")
  private String loadCompendiumsProblems() {
    return getDivByClassName("problems", "compendiums-problems-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "nomenclatures.html"
  */
  @GetMapping("/nomenclatures")
  private String loadCompendiumsNomenclatures() {
    return getDivByClassName("nomenclatures", "compendiums-nomenclatures-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "devices.html"
  */
  @GetMapping("/devices")
  private String loadCompendiumsDevices() {
    return getDivByClassName("devices", "compendiums-devices-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "contractors.html"
  */
  @GetMapping("/contractors")
  private String loadCompendiumsContractors() {
    return getDivByClassName("contractors", "compendiums-contractors-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/complete-sets")
  private String loadCompendiumsCompleteSets() {
    return getDivByClassName("complete-sets", "compendiums-complete-sets-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/cash-items/consumption.html"
  */
  @GetMapping("/cash-items/consumption")
  private String loadCompendiumsCashItemsConsumption() {
    return getDivByClassName("cash-items/consumption", "compendiums-cash-items-consumption-panel");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/cash-items/income.html"
  */
  @GetMapping("/cash-items/income")
  private String loadCompendiumsCashItemIncome() {
    return getDivByClassName("cash-items/income", "compendiums-cash-items-income-panel");
  }
}

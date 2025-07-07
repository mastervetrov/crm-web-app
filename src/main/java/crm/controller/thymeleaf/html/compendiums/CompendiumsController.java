package crm.controller.thymeleaf.html.compendiums;

import crm.controller.thymeleaf.html.BaseHtmlController;
import crm.controller.thymeleaf.html.BaseUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/compendiums")
@BaseUrl("/crm/web-app/compendiums/")
public class CompendiumsController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "works.html"
  */
  @GetMapping("/works")
  private String showCompendiumsWorks() {
    return getHtml("works");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "units.html"
  */
  @GetMapping("/units")
  private String showCompendiumsUnits() {
    return getHtml("units");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "problems.html"
  */
  @GetMapping("/problems")
  private String showCompendiumsProblems() {
    return getHtml("problems");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "nomenclatures.html"
  */
  @GetMapping("/nomenclatures")
  private String showCompendiumsNomenclatures() {
    return getHtml("nomenclatures");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "devices.html"
  */
  @GetMapping("/devices")
  private String showCompendiumsDevices() {
    return getHtml("devices");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "contractors.html"
  */
  @GetMapping("/contractors")
  private String showCompendiumsContractors() {
    return getHtml("contractors");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "complete-sets.html"
  */
  @GetMapping("/complete-sets")
  private String showCompendiumsCompleteSets() {
    return getHtml("complete-sets");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "cash-items/consumption.html"
  */
  @GetMapping("/cash-items/consumption")
  private String showCompendiumsCashItemsConsumption() {
    return getHtml("cash-items/consumption");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "cash-items/income.html"
  */
  @GetMapping("/cash-items/income")
  private String showCompendiumsCashItemIncome() {
    return getHtml("cash-items/income");
  }
}

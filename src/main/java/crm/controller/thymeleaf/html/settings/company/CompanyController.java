package crm.controller.thymeleaf.html.settings.company;

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
@RequestMapping("/crm/web-app/settings/company")
@BaseUrl("/crm/web-app/settings/company/")
public class CompanyController extends BaseHtmlController {

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/general/company.html"
  */
  @GetMapping("/general/company")
  private String showSettingsCompany() {
    return getHtml("general/company");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/general/director.html"
  */
  @GetMapping("/general/director")
  private String showSettingsDirector() {
    return getHtml("general/director");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/general/details.html"
  */
  @GetMapping("/general/details")
  private String showSettingsDetails() {
    return getHtml("general/details");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/general/custom.html"
  */
  @GetMapping("/general/custom")
  private String showSettingsCustom() {
    return getHtml("general/custom");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "locations.html"
  */
  @GetMapping("/locations")
  private String showSettingsLocations() {
    return getHtml("locations");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/employees/employees.html"
  */
  @GetMapping("/employees/employees")
  private String showSettingsEmployees() {
    return getHtml("employees/employees");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/employees/roles.html"
  */
  @GetMapping("/employees/roles")
  private String showSettingsRoles() {
    return getHtml("employees/roles");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/employees/wages.html"
  */
  @GetMapping("/employees/wages")
  private String showSettingsWages() {
    return getHtml("employees/wages");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/employees/owner.html"
  */
  @GetMapping("/employees/owner")
  private String showSettingsOwner() {
    return getHtml("employees/owner");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "/safety/all.html"
  */
  @GetMapping("/safety/all")
  private String showSettingsSafetyAll() {
    return getHtml("safety/all");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "safety/custom.html"
  */
  private String showSettingsSafetyCustom() {
    return getHtml("safety/custom");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "subscription.html"
  */
  @GetMapping("/subscription")
  private String showSubscription() {
    return getHtml("subscription");
  }
}

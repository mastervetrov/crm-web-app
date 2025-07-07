package crm.controller.thymeleaf.ajax.settings.company;

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
@RequestMapping("/crm/web-app/ajax/settings/company")
@BaseUrlAjax("/crm/web-app/settings/company/")
public class CompanyAjaxController extends BaseAjaxController {

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/general/company.html"
  */
  @GetMapping("/general/company")
  private String loadSettingsCompany() {
    return getDivByClassName("general/company", "settingsGeneralCompanyContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "complete.html"
  */
  @GetMapping("/general/director")
  private String loadSettingsDirector() {
    return getDivByClassName("general/director", "settingsGeneralDirectorContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/general/details.html"
  */
  @GetMapping("/general/details")
  private String loadSettingsDetails() {
    return getDivByClassName("general/details", "settingsGeneralDetailsContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/general/custom.html"
  */
  @GetMapping("/general/custom")
  private String loadSettingsCustom() {
    return getDivByClassName("general/custom", "settingsGeneralCustomContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "locations.html"
  */
  @GetMapping("/locations")
  private String loadSettingsLocations() {
    return getDivByClassName("locations", "settingsCompanyLocationsContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/employees/employees.html"
  */
  @GetMapping("/employees/employees")
  private String showSettingsEmployees() {
    return getDivByClassName("employees/employees", "settingsEmployeesEmployeesContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/employees/roles.html"
  */
  @GetMapping("/employees/roles")
  private String loadSettingsRoles() {
    return getDivByClassName("employees/roles", "settingsEmployyesRolesContent");
  }
    
  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/employees/wages.html"
  */
  @GetMapping("/employees/wages")
  private String loadSettingsWages() {
    return getDivByClassName("employees/wages", "settingsEmployeesWagesContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "/employees/owner.html"
  */
  @GetMapping("/employees/owner")
  private String loadSettingsOwner() {
    return getDivByClassName("employees/owner", "settingsEmployeesOwnerContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "safety.html"
  */
  @GetMapping("/safety")
  private String loadSettingsSafetyAll() {
    return getDivByClassName("safety/all", "settingsSafetyAllContent");
  }

  private String loadSettingsSafetyCustom() {
    return getDivByClassName("safety/custom", "settingsSafetyCustomContent");
  }

  /**
  * Method of rendering fragments html page via thymeleaf.
  *
  * @return "subscription.html"
  */
  @GetMapping("/subscription")
  private String loadSubscription() {
    return getDivByClassName("subscription", "settingsSubscriptionContent");
  }
}

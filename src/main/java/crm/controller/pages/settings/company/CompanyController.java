package crm.controller.pages.settings.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/settings/company")
public class CompanyController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/settings/company/" + subPath;
    }

    // ---------GENERAL---------
    @GetMapping("/general/company")
    private String showSettingsCompany() {
        return getTemplatePath("general/company");
    }

    @GetMapping("/general/director")
    private String showSettingsDirector() {
        return getTemplatePath("general/director");
    }

    @GetMapping("/general/details")
    private String showSettingsDetails() {
        return getTemplatePath("general/details");
    }

    @GetMapping("/general/custom")
    private String showSettingsCustom() {
        return getTemplatePath("general/custom");
    }


    // ---------LOCATIONS---------
    @GetMapping("/locations")
    private String showSettingsLocations() {
        return getTemplatePath("locations");
    }


    // ---------EMPLOYEES---------
    @GetMapping("/employees/employees")
    private String showSettingsEmployees() {
        return getTemplatePath("employees/employees");
    }

    @GetMapping("/employees/roles")
    private String showSettingsRoles() {
        return getTemplatePath("employees/roles");
    }

    @GetMapping("/employees/wages")
    private String showSettingsWages() {
        return getTemplatePath("employees/wages");
    }

    @GetMapping("/employees/owner")
    private String showSettingsOwner() {
        return getTemplatePath("employees/owner");
    }


    // ---------SAFETY---------
    @GetMapping("/safety/all")
    private String showSettingsSafetyAll() {
        return getTemplatePath("safety/all");
    }

    //is-not-use
    private String showSettingsSafetyCustom() {
        return getTemplatePath("safety/custom");
    }


    // ---------SUBSCRIPTION---------
    @GetMapping("/subscription")
    private String showSubscription() {
        return getTemplatePath("subscription");
    }
}

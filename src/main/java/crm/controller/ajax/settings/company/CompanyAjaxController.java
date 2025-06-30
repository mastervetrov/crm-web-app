package crm.controller.ajax.settings.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/ajax/settings/company")
public class CompanyAjaxController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/settings/company/" + subPath;
    }
    // ---------GENERAL---------
    @GetMapping("/general/company")
    private String loadSettingsCompany() {
        return getTemplatePath("general/company :: div#settingsGeneralCompanyContent");
    }

    @GetMapping("/general/director")
    private String loadSettingsDirector() {
        return getTemplatePath("general/director :: div#settingsGeneralDirectorContent");
    }

    @GetMapping("/general/details")
    private String loadSettingsDetails() {
        return getTemplatePath("general/details :: div#settingsGeneralDetailsContent");
    }

    @GetMapping("/general/custom")
    private String loadSettingsCustom() {
        return getTemplatePath("general/custom :: div#settingsGeneralCustomContent");
    }


    // ---------LOCATIONS---------
    @GetMapping("/locations")
    private String loadSettingsLocations() {
        return getTemplatePath("locations :: div#settingsCompanyLocationsContent");
    }


    // ---------EMPLOYEES---------
    @GetMapping("/employees/employees")
    private String showSettingsEmployees() {
        return getTemplatePath("employees/employees :: div#settingsEmployeesEmployeesContent");
    }

    @GetMapping("/employees/roles")
    private String loadSettingsRoles() {
        return getTemplatePath("employees/roles :: div#settingsEmployyesRolesContent");
    }

    @GetMapping("/employees/wages")
    private String loadSettingsWages() {
        return getTemplatePath("employees/wages :: div#settingsEmployeesWagesContent");
    }

    @GetMapping("/employees/owner")
    private String loadSettingsOwner() {
        return getTemplatePath("employees/owner :: div#settingsEmployeesOwnerContent");
    }


    // ---------SAFETY---------
    @GetMapping("/safety")
    private String loadSettingsSafetyAll() {
        return getTemplatePath("safety/all :: div#settingsSafetyAllContent");
    }

    private String loadSettingsSafetyCustom() {
        return getTemplatePath("safety/custom :: div#settingsSafetyCustomContent");
    }


    // ---------SUBSCRIPTION---------
    @GetMapping("/subscription")
    private String loadSubscription() {
        return getTemplatePath("subscription :: div#settingsSubscriptionContent");
    }
}

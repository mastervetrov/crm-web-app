package crm.controller.thymeleaf.html;

import crm.exception.controller.BaseUrlAnnotationNotFoundException;

/**
 * Basic implementation for controllers, which use site page return.
 *
 * <p>This class forces all child controllers to be annotated with the {@link BaseUrl}.</p>
 *
 * <p>Value of annotation {@link BaseUrl} define path to base dir(template) of controller,
 * which contains target html.</p>
 * <pre> {@code
 *
 * @Controller
 * @RequestMapping("/crm/web-app")
 * @BaseUrl("/crm/web-app/") //all child controllers to be annotated
 * public class MainController extends BaseHtmlController {
 *
 *   @GetMapping("")
 *   public String showAdminPanel() {
 *     return getHtml("main"); //equal return "/crm/web-app/main";
 *   }
 *}
 *
 * }</pre>
 *
 * @see crm.controller.thymeleaf.html.MainController
 */
public abstract class BaseHtmlController {

  private String baseUrl;

  /**
   * This constructor for injecting baseUrl.
   * If child class without annotation, be exception {@link BaseUrlAnnotationNotFoundException}.
   */
  public BaseHtmlController() {
    BaseUrl annotation = this.getClass().getAnnotation(BaseUrl.class);
    if (annotation != null) {
      this.baseUrl = annotation.value();
    } else {
      throw new BaseUrlAnnotationNotFoundException("@BaseUrl required for BaseHtmlController");
    }
  }

  /**
   * Getter of baseUrl.
   *
   * @return baseUrl;
   */
  protected String getBaseUrl() {
    return baseUrl;
  }

  /**
   * Method to get the final path to html file.
   *
   * @param subPath specified additional path
   * @return string, contains final path to html file
   */
  public String getHtml(String subPath) {
    return getBaseUrl() + "/" + subPath;
  }
}
package crm.controller.thymeleaf.ajax;

import crm.exception.controller.BaseUrlAnnotationNotFoundException;

/**
 * Basic implementation for controllers, which use html fragments return.
 *
 * <p>This class forces all child controllers to be annotated with the {@link BaseUrlAjax}.</p>
 *
 * <p>Value of annotation {@link BaseUrlAjax} define path to base dir(template) of controllers,
 * which contains target html.</p>
 *
 * <pre> {@code
 *
 * @Controller
 * @RequestMapping("/crm/web-app")
 * @BaseUrlAjax("/crm/web-app/") //all child controllers to be annotated
 * public class MainAjaxController extends BaseAjaxController {
 *
 *   @GetMapping("/main")
 *   public String loadMain() {
 *     return getDivByClassName("main", "main-panel");
 *     // method getDivByClassName represents:
 *     // return baseUrl + "main" + " :: dir." + "main-panel";
 *   }
 *}
 *
 * }</pre>
 *
 * @see MainAjaxController
 */
public abstract class BaseAjaxController {

  private String baseUrl;

  /**
  * This constructor for injecting baseUrl.
  * If child class without annotation, be exception {@link BaseUrlAnnotationNotFoundException}.
  */
  public BaseAjaxController() {
    BaseUrlAjax annotation = this.getClass().getAnnotation(BaseUrlAjax.class);
    if (annotation != null) {
      this.baseUrl = annotation.value();
    } else {
      throw new BaseUrlAnnotationNotFoundException("@BaseUrlAjaxAjax required BaseAjaxController");
    }
  }

  /**
   * Getter of baseUrl.
   *
   * @return baseUrl.
   */
  protected String getBaseUrl() {
    return baseUrl;
  }

  /**
   * Creating template for receiving html fragments by div.className.
   *
   * @param pathHtml path to html file
   * @param className class name div
   * @return template thymeleaf
   */
  public String getDivByClassName(String pathHtml, String className) {
    return getBaseUrl() + pathHtml + " :: div." +  className;
  }
}

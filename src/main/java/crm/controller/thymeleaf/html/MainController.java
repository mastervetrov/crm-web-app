package crm.controller.thymeleaf.html;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app")
@BaseUrl("/crm/web-app/")
@Slf4j
public class MainController extends BaseHtmlController {


  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "main.html"
  */
  @GetMapping("")
  public String showAdminPanel() {
    return getHtml("main");
  }

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "main.html"
  */
  @GetMapping("/main")
  public String showMain() {
    return getHtml("main");
  }
}

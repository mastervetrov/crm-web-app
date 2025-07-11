package crm.controller.thymeleaf.html.store.remainder;

import crm.controller.thymeleaf.html.BaseHtmlController;
import crm.controller.thymeleaf.html.BaseUrl;
import crm.dto.product.ProductDto;
import crm.service.product.ProductService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller returns site page.
 * todo информация будет дополнена
 */
@Controller
@RequestMapping("/crm/web-app/store/remainder")
@BaseUrl("/crm/web-app/store/")
@AllArgsConstructor
@Slf4j
public class RemainderController extends BaseHtmlController {

  private final ProductService productService;

  /**
  * Method of rendering hmtl page via thymeleaf.
  *
  * @return "remainder.html"
  */
  @GetMapping("")
  private String showStoreRemainder(Model model) {

    List<String> fieldsSettings = List.of("id",
            "name",
            "description",
            "retailPrice",
            "dealerPrice",
            "partnerPrice");

    log.info("Поступил запрос от клиента, его настройки: {}", fieldsSettings.toString());

    Page<ProductDto> productsResponsesPage = productService.findAllByFields(fieldsSettings, 0, 20);
    List<ProductDto> productDtoList = productsResponsesPage.getContent();
    log.info("Проверка перед выводом в Template: " + productDtoList.toString());
    model.addAttribute("products", productDtoList);
    model.addAttribute("fieldNames", fieldsSettings);

    return getHtml("remainder");
  }

  /**
  * Method of rendering html page via thymeleaf.
  *
  * @return "remainder/new.html"
  */
  @PostMapping("/new")
  private String showStoreRemainderNew(Model model) {
    return getHtml("remainder/new");
  }
}

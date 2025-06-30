package crm.controller.pages.store.remainder;


import crm.dto.product.response.ProductDto;
import crm.service.product.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/crm/web-app/store/remainder")
@AllArgsConstructor
@Slf4j
public class RemainderController {

    private final ProductService productService;

    @GetMapping("")
    private String showStoreRemainder(Model model) {
        List<String> fieldsSettings = List.of("id", "name", "description", "retailPrice", "dealerPrice", "partnerPrice");

        log.info("Поступил запрос от клиента, его настройки: {}", fieldsSettings.toString());

        Page<ProductDto> productsResponsesPage = productService.findAll(0,20);
        List<ProductDto> productDtoList = productsResponsesPage.getContent();
        log.info("Проверка перед выводом в Template: " + productDtoList.toString());
        model.addAttribute("products", productDtoList);
        model.addAttribute("fieldNames", fieldsSettings);

        return "/crm/web-app/store/remainder";
    }

    @PostMapping("/new")
    private String showStoreRemainderNew(Model model) {
        return "/crm/web-app/store/remainder/new";
    }
}

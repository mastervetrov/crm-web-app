package crm.controller.pages.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crm/web-app/store")
@Slf4j
public class StoreController {

    private String getTemplatePath(String subPath) {
        return "/crm/web-app/store/" + subPath;
    }

    @GetMapping("/settings")
    private String showStoreSettings() {
        return getTemplatePath("settings");
    }

    @GetMapping("/moves")
    private String showStoreMoves() {
        return getTemplatePath("moves");
    }

    @GetMapping("/inventory")
    private String showStoreInventory() {
        return getTemplatePath("inventory");
    }

    @GetMapping("/cancellations")
    private String showStoreCancellations() {
        return getTemplatePath("cancellations");
    }

    @GetMapping("/returns/purchase")
    private String showStoreReturnsPurchase() {
        return getTemplatePath("returns/purchase");
    }

    @GetMapping("/returns/sales")
    private String showStoreReturnsSales() {
        return getTemplatePath("returns/sales");
    }

//    @GetMapping("/remainder")
//    private String showStoreRemainder(Model model) {
//        List<String> fields = List.of("id", "name", "count", "retailPrice");
//        log.info("Поступил запрос от клиента: {}", fields.toString());
//
//        List<ProductDto> productsRequest = new ArrayList<>();
//        List<ProductDto> productsResponses = new ArrayList<>();
//
//        for (int i = 0; i < 20; i++) {
//            ProductDto product = new ProductDto();
//            product.setId((long) i);
//            product.setCategory("Категория " + i);
//            product.setCount(i);
//            product.setHit(true);
//            product.setName("Дисплей для iPhone " + i);
//            product.setNew(true);
//            product.setPicture("megaurl");
//            product.setRetailPrice(new BigDecimal(100 + i));
//            product.setDealerPrice(new BigDecimal(150 + i));
//            product.setPartnerPrice(new BigDecimal(200 + i));
//            product.setDescription("Товар высшего качества для iPhone " + i);
//            product.setUpdatedAt(LocalDateTime.now().toString());
//            productsRequest.add(product);
//        }
//
//        for (ProductDto productDtoRequest : productsRequest) {
//            ProductDto productDtoResponse = new ProductDto();
//            if (fields.contains("id")) {
//                productDtoResponse.setId(productDtoRequest.getId());
//                productDtoResponse.addParameter(productDtoRequest.getId().toString());
//            }
//            if (fields.contains("count")) {
//                productDtoResponse.setCount(productDtoRequest.getCount());
//                productDtoResponse.addParameter(productDtoRequest.getCount().toString());
//            }
//            if (fields.contains("name")) {
//                productDtoResponse.setName(productDtoRequest.getName());
//                productDtoResponse.addParameter(productDtoRequest.getName());
//            }
//            if (fields.contains("retailPrice")) {
//                productDtoResponse.setRetailPrice(productDtoRequest.getRetailPrice());
//                productDtoResponse.addParameter(productDtoRequest.getRetailPrice().toString());
//            }
//            productsResponses.add(productDtoResponse);
//        }
//
//
//        model.addAttribute("products", productsResponses);
//        model.addAttribute("parametersNames", fields);
//
//        return "/crm/web-app/store/remainder";
//
//    }

}

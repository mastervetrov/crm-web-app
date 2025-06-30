package crm.controller.pages.store.receipt;

import crm.dto.receipt.response.ProductReceiptDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/crm/web-app/store/receipt")
@Slf4j
public class ReceiptController {

    @GetMapping("")
    private String showStoreReceipt() {

        List<String> fields = List.of("id", "name", "count", "retailPrice");
        List<String> fieldsReceipts = List.of("code", "newCount", "productName", "purchasePrice", "retailPrice");

        return "/crm/web-app/store/receipt";
    }

    @GetMapping("/new")
    private String showStoreReceiptNew(Model model) {
        List<String> fields = List.of("id", "name", "count", "retailPrice");
        List<String> fieldsReceipts = List.of("code", "newCount", "productName", "purchasePrice", "retailPrice");

        log.info("Поступил запрос от клиента: {}", fieldsReceipts.toString());

        List<ProductReceiptDto> productsRequest = new ArrayList<>();
        List<ProductReceiptDto> productsResponses = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            ProductReceiptDto product = new ProductReceiptDto();
            product.setCode((long) i);
            product.setName("Товар " + i);
            product.setNewCount(i);
            product.setPurchasePrice(new BigDecimal(100 + i));
            product.setRetailPrice(new BigDecimal(100 + i));
            productsRequest.add(product);
        }

        for (ProductReceiptDto productReceiptDtoRequest : productsRequest) {
            ProductReceiptDto productReceiptDtoResponse = new ProductReceiptDto();
            if (fieldsReceipts.contains("code")) {
                productReceiptDtoResponse.setCode(productReceiptDtoRequest.getCode());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getCode().toString());
            }
            if (fieldsReceipts.contains("newCount")) {
                productReceiptDtoResponse.setNewCount(productReceiptDtoRequest.getNewCount());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getNewCount().toString());
            }
            if (fieldsReceipts.contains("productName")) {
                productReceiptDtoResponse.setName(productReceiptDtoRequest.getName());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getName());
            }
            if (fieldsReceipts.contains("purchasePrice")) {
                productReceiptDtoResponse.setPurchasePrice(productReceiptDtoRequest.getPurchasePrice());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getPurchasePrice().toString());
            }
            if (fieldsReceipts.contains("retailPrice")) {
                productReceiptDtoResponse.setRetailPrice(productReceiptDtoRequest.getRetailPrice());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getRetailPrice().toString());
            }
            productsResponses.add(productReceiptDtoResponse);
        }

        model.addAttribute("products", productsResponses);
        model.addAttribute("parametersNames", fieldsReceipts);

        return "/crm/web-app/store/receipt/new";
    }

    @GetMapping("/{id}")
    private String showStoreReceiptNew(Model model, @PathVariable Long id) {

        List<String> fieldsReceipts = List.of("code", "newCount", "productName", "purchasePrice", "retailPrice"); //поля которые будут отображены в поступлении

        log.info("Поступил запрос от клиента: {}", fieldsReceipts.toString());

        List<ProductReceiptDto> productsRequest = new ArrayList<>();
        List<ProductReceiptDto> productsResponses = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            ProductReceiptDto product = new ProductReceiptDto();
            product.setCode((long) i);
            product.setName("Товар " + i);
            product.setNewCount(i);
            product.setPurchasePrice(new BigDecimal(100 + i));
            product.setRetailPrice(new BigDecimal(100 + i));
            productsRequest.add(product);
        }

        for (ProductReceiptDto productReceiptDtoRequest : productsRequest) {
            ProductReceiptDto productReceiptDtoResponse = new ProductReceiptDto();
            if (fieldsReceipts.contains("code")) {
                productReceiptDtoResponse.setCode(productReceiptDtoRequest.getCode());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getCode().toString());
            }
            if (fieldsReceipts.contains("newCount")) {
                productReceiptDtoResponse.setNewCount(productReceiptDtoRequest.getNewCount());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getNewCount().toString());
            }
            if (fieldsReceipts.contains("productName")) {
                productReceiptDtoResponse.setName(productReceiptDtoRequest.getName());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getName());
            }
            if (fieldsReceipts.contains("purchasePrice")) {
                productReceiptDtoResponse.setPurchasePrice(productReceiptDtoRequest.getPurchasePrice());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getPurchasePrice().toString());
            }
            if (fieldsReceipts.contains("retailPrice")) {
                productReceiptDtoResponse.setRetailPrice(productReceiptDtoRequest.getRetailPrice());
                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getRetailPrice().toString());
            }
            productsResponses.add(productReceiptDtoResponse);
        }

        model.addAttribute("products", productsResponses);
        model.addAttribute("parametersNames", fieldsReceipts);

        return "/crm/web-app/store/receipt/new";
    }


//    //Данный метод должен открывать окно добавления нового поступления, а значит оно должно быть пустым(без добавленных товаров)!
//    @GetMapping("/receipt/new")
//    private String showStoreReceiptNew(Model model, ReceiptColumns receiptColumns) {
//        //нужно реализовать получение настроенных пользовтаелем полей
//        //настройка выбранных полей должна сохраняться в базе данных в отдельной таблице настроек
//        List<String> fieldsReceipts = List.of("code", "newCount", "productName", "purchasePrice", "retailPrice");
//        receiptService.findAll();
//        model.addAttribute(productReceiptList);
//        return "/crm/web-app/store/receipt/new";
//    }
//
//    private String showStoreReceiptUpdate(Model model) {
//        //нужно реализовать получение настроенных пользовтаелем полей
//        //настройка выбранных полей должна сохраняться в базе данных в отдельной таблице настроек
//        List<String> fieldsReceipts = List.of("code", "newCount", "productName", "purchasePrice", "retailPrice");
//
//        log.info("Поступил запрос от клиента: {}", fieldsReceipts.toString());
//
//        List<ProductReceiptDto> productsRequest = new ArrayList<>();
//        List<ProductReceiptDto> productsResponses = new ArrayList<>();
//
//        for (int i = 0; i < 20; i++) {
//            ProductReceiptDto product = new ProductReceiptDto();
//            product.setCode((long) i);
//            product.setName("Товар " + i);
//            product.setNewCount(i);
//            product.setPurchasePrice(new BigDecimal(100 + i));
//            product.setRetailPrice(new BigDecimal(100 + i));
//            productsRequest.add(product);
//        }
//
//        for (ProductReceiptDto productReceiptDtoRequest : productsRequest) {
//            ProductReceiptDto productReceiptDtoResponse = new ProductReceiptDto();
//            if (fieldsReceipts.contains("code")) {
//                productReceiptDtoResponse.setCode(productReceiptDtoRequest.getCode());
//                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getCode().toString());
//            }
//            if (fieldsReceipts.contains("newCount")) {
//                productReceiptDtoResponse.setNewCount(productReceiptDtoRequest.getNewCount());
//                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getNewCount().toString());
//            }
//            if (fieldsReceipts.contains("productName")) {
//                productReceiptDtoResponse.setName(productReceiptDtoRequest.getName());
//                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getName());
//            }
//            if (fieldsReceipts.contains("purchasePrice")) {
//                productReceiptDtoResponse.setPurchasePrice(productReceiptDtoRequest.getPurchasePrice());
//                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getPurchasePrice().toString());
//            }
//            if (fieldsReceipts.contains("retailPrice")) {
//                productReceiptDtoResponse.setRetailPrice(productReceiptDtoRequest.getRetailPrice());
//                productReceiptDtoResponse.addParameter(productReceiptDtoRequest.getRetailPrice().toString());
//            }
//            productsResponses.add(productReceiptDtoResponse);
//        }
//
//        model.addAttribute("products", productsResponses);
//        model.addAttribute("parametersNames", fieldsReceipts);
//    }

}

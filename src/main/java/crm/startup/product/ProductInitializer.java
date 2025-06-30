package crm.startup.product;

import crm.dto.product.request.ProductUpsertRequest;
import crm.model.product.Product;
import crm.service.product.ProductService;
import crm.startup.DatabaseSeeder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@AllArgsConstructor
@Slf4j
public class ProductInitializer implements DatabaseSeeder {
    private final Random random = new Random();
    private final ProductService productService;

    public void initialize() {
        List<Product> productsList = new ArrayList<>();

        for(int i = 1; i <= 20;i++) {

            ProductUpsertRequest productUpsertRequest = new ProductUpsertRequest();
            productUpsertRequest.setName("Запчасть " + i);
            productUpsertRequest.setCount(i);
            productUpsertRequest.setHit(random.nextBoolean());
            productUpsertRequest.setNew(random.nextBoolean());
            productUpsertRequest.setDescription("Описание запчасти " + i);
            productUpsertRequest.setRetailPrice(new BigDecimal(i + 3));
            productUpsertRequest.setDealerPrice(new BigDecimal(i + 2));
            productUpsertRequest.setPartnerPrice(new BigDecimal(i + 1));
            productUpsertRequest.setPicture("image for you");

            if (i == 1) {
                log.info(productUpsertRequest.toString());
            }

            productService.save(productUpsertRequest);
        }
        System.out.println("Все тестовые товары загружены");
    }
}

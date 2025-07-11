package crm.startup.product;

import crm.model.product.Product;
import crm.request.product.ProductRequest;
import crm.service.product.ProductService;
import crm.startup.DatabaseSeeder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Product Entity initializer.
 *
 * @see crm.repository.product.ProductRepository
 * @see ProductService
 * @see Product
 * @see ProductRequest
 * @see crm.dto.product.ProductDto
 */
@Component
@AllArgsConstructor
@Slf4j
public class ProductInitializer implements DatabaseSeeder {

  private final Random random = new Random();
  private final ProductService productService;

  /**
   * Method initialize.
   */
  public void initialize() {
    List<Product> productsList = new ArrayList<>();

    for (int i = 1; i <= 20; i++) {
      ProductRequest productUpsertRequest = new ProductRequest();
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

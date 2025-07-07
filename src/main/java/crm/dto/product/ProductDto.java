package crm.dto.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import crm.service.product.ProductSvc;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 * Response Dto - contains product data.
 * Used for return to the controllers.
 *
 * @see crm.model.product.Product
 * @see ProductSvc
 * @see crm.controller.thymeleaf.html.store.remainder.RemainderController
 * @see crm.controller.thymeleaf.ajax.store.remainder.RemainderAjaxController
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductDto {
  private Long id;
  private String name;
  private String description;
  private BigDecimal retailPrice;
  private BigDecimal dealerPrice;
  private BigDecimal partnerPrice;
  private Integer count;
  private boolean isNew;
  private boolean isHit;
  private String picture;
  private String category;
  private String createdAt;
  private String updatedAt;

  /**
  *  Method for return field list with objects values.
  * todo определить назначение этого метода и описать javadoc.
  */
  public Map<String, Object> getParametersMap() {
    Map<String, Object> parametersMap = new HashMap<>();
    parametersMap.put("id", id);
    parametersMap.put("name", name);
    parametersMap.put("description", description);
    parametersMap.put("retailPrice", retailPrice);
    parametersMap.put("dealerPrice", dealerPrice);
    parametersMap.put("partnerPrice", partnerPrice);
    parametersMap.put("count", count);
    parametersMap.put("isNew", isNew);
    parametersMap.put("isHit", isHit);
    parametersMap.put("picture", picture);
    parametersMap.put("category", category);
    parametersMap.put("createdAt", createdAt);
    parametersMap.put("updatedAt", updatedAt);
    return parametersMap;
  }
}

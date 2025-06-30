package crm.dto.product.response;

import like_online_store.crm_app.dto.response.ApiResponseWithData;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ProductResponse extends ApiResponseWithData {
    private ProductDto product;
}

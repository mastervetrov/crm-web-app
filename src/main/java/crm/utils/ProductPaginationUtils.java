package crm.utils;

import crm.dto.product.response.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface ProductPaginationUtils {
    Page<ProductDto> convertToPageProductDto(Page<Map<String, Object>> data);
}

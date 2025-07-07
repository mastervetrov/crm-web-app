package crm.utils;

import crm.dto.product.ProductDto;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

/**
 * Utility interface for handling pagination and conversion of product data.
 */
@Component
public interface ProductPaginationUtils {
  /**
   * Converts a page of raw data maps into a page of ProductDto objects.
   *
   * @param data data the paginated raw data, where each item is a map representing product fields
   * @return a Page containing dto objects {@link ProductDto} constructed from the input data
   */
  Page<ProductDto> convertToPageProductDto(Page<Map<String, Object>> data);
}

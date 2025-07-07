package crm.utils;

import crm.dto.product.ProductDto;
import crm.mapper.product.ProductMapper;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

/**
 * Utility class.
 *
 * @see ProductPaginationUtils
 * @see ProductMapper
 * @see ProductDto
 * @see crm.model.product.Product
 * @see crm.service.product.ProductSvc
 */
@Component
@AllArgsConstructor
public class ProductPaginationUtilsImpl implements ProductPaginationUtils {

  private final ProductMapper mapper;

  /**
   * Converting data with map format representable entity {@link crm.model.product.Product},
   * to Page productDto {@link ProductDto}.
   *
   * @param data product list (Map format)
   * @return page ProductDto {@link ProductDto}
   */
  public Page<ProductDto> convertToPageProductDto(Page<Map<String, Object>> data) {
    List<ProductDto> productDtoList = mapper.mapListToProductDtoList(data.getContent());
    return new PageImpl<>(productDtoList, data.getPageable(), data.getTotalElements());
  }
}

package crm.mapper.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import crm.dto.product.ProductDto;
import crm.mapper.BaseMapper;
import crm.model.product.Product;
import crm.request.product.ProductRequest;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link Product}.
 *
 * @see Product
 * @see ProductDto
 * @see ProductRequest
 * @see crm.service.product.Productservice
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper extends BaseMapper<ProductRequest, Product, ProductDto> {

  ObjectMapper mapper = new ObjectMapper();

  /**
   * Mapping map (contains string and object), to dto {@link ProductDto}.
   * Used when getting product dto with service {@link crm.service.product.Productservice}
   *
   * @param map contains data
   * @return dto {@link ProductDto}
   */
  default ProductDto mapToProductDto(Map<String, Object> map) {
    if (map == null || map.isEmpty()) {
      return null;
    }
    return mapper.convertValue(map, ProductDto.class);
  }

  /**
   * Mapping map list (contains string and object), to dto list {@link ProductDto}.
   * Used when getting product dto list with service {@link crm.service.product.Productservice}
   *
   * @param mapList contains data
   * @return dto list {@link ProductDto}
   */
  default List<ProductDto> mapListToProductDtoList(List<Map<String, Object>> mapList) {
    if (mapList == null || mapList.isEmpty()) {
      return Collections.emptyList();
    }
    return mapList.stream()
        .filter(Objects::nonNull)
        .map(this::mapToProductDto)
        .collect(Collectors.toList());
  }
}

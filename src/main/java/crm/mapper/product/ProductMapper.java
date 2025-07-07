package crm.mapper.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import crm.dto.product.ProductDto;
import crm.model.product.Product;
import crm.request.product.ProductUpsertRequest;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * Mapper for entity {@link Product}.
 *
 * @see Product
 * @see ProductDto
 * @see ProductUpsertRequest
 * @see crm.service.product.ProductSvc
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

  ObjectMapper mapper = new ObjectMapper();

  /**
   * Mapping request {@link ProductUpsertRequest} to entity {@link Product}.
   * Used for preserving the product.
   *
   * @param request contains data
   * @return entity instance {@link Product} with id == null
   */
  Product requestToEntity(ProductUpsertRequest request);

  /**
   * Mapping request {@link ProductUpsertRequest} to entity {@link Product},
   * setting specified id.
   *
   * @param id identifier, to be set in the entity
   * @param request contains data
   * @return entity instance {@link Product} with installed id
   */
  Product requestToEntity(Long id, ProductUpsertRequest request);

  /**
   * Mapping entity {@link Product} to dto {@link ProductDto}.
   * Used when getting product.
   *
   * @param product contains data.
   * @return dto instance {@link ProductDto}
   */
  ProductDto productToProductDto(Product product);

  /**
   * Mapping entity list {@link Product} to dto list {@link ProductDto}.
   * Used when getting products list.
   *
   * @param productList contains data
   * @return dto list {@link ProductDto}
   */
  List<ProductDto> productListToProductDtoList(List<Product> productList);

  /**
   * Mapping entity page {@link Product} to dto page {@link ProductDto}.
   * Used when getting products page.
   *
   * @param productPage contains data
   * @return dto page {@link ProductDto}
   */
  default Page<ProductDto> productPageToProductDtoPage(Page<Product> productPage) {
    List<Product> productList = productPage.getContent();
    List<ProductDto> productDtoList = productListToProductDtoList(productList);
    Pageable pageable = productPage.getPageable();
    Integer totalPages = productPage.getTotalPages();
    Page<ProductDto> productDtoPage = new PageImpl<>(productDtoList, pageable, totalPages);
    return productDtoPage;
  }

  /**
   * Mapping map (contains string and object), to dto {@link ProductDto}.
   * Used when getting product dto with service {@link crm.service.product.ProductSvc}
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
   * Used when getting product dto list with service {@link crm.service.product.ProductSvc}
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

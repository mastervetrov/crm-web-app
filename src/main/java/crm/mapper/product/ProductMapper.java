package crm.mapper.product;

import crm.dto.product.response.ProductDto;
import crm.dto.product.request.ProductUpsertRequest;
import crm.model.product.Product;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.*;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    Product productRequestToProduct(ProductUpsertRequest request);

    Product productRequestToProduct(Long id, ProductUpsertRequest request);

    ProductDto productToProductDto(Product product);

    List<ProductDto> productListToProductDtoList(List<Product> productList);

    default Page<ProductDto> productPageToProductDtoPage(Page<Product> productPage) {

        List<Product> productList = productPage.getContent();
        List<ProductDto> productDtoList = productListToProductDtoList(productList);
        Page<ProductDto> productDtoPage = new PageImpl<>(productDtoList, productPage.getPageable(), productPage.getTotalPages());
        return productDtoPage;
    }
    default ProductDto mapToProductDto(Map<String, Object> map) {
//        ObjectMapper mapper = new ObjectMapper();

        if (map == null || map.isEmpty()) {
            return null;
        }
//        return mapper.convertValue(map, ProductDto.class);
        return null;
    }

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

package crm.utils;

import crm.dto.product.response.ProductDto;
import crm.mapper.product.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class IProductPaginationUtils implements ProductPaginationUtils{

    private final ProductMapper mapper;

    /**
     * Convert data with map format to Page productDto
     *
     * @param data  product list (Map format)
     * @return page ProductDto
     */
    public Page<ProductDto> convertToPageProductDto(Page<Map<String, Object>> data) {

        //MAPPING to productDtoList
        List<ProductDto> productDtoList = mapper.mapListToProductDtoList(data.getContent());
        return new PageImpl<>(productDtoList, data.getPageable(), data.getTotalElements());
    }
}

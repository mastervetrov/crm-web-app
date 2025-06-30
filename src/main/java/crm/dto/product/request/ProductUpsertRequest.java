package crm.dto.product.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProductUpsertRequest {
    private String name;
    private String description;
    private BigDecimal retailPrice;
    private BigDecimal dealerPrice;
    private BigDecimal partnerPrice;
    private Integer count;
    private boolean isNew;
    private boolean isHit;
    private String picture;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    //    private ReviewsList reviews;
    //    private Category category;
}

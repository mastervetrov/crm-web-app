package crm.dto.product.response;

import java.math.BigDecimal;

public class ProductMiniDto {
    private Long id;
    private String name;
    private BigDecimal retailPrice;
    private BigDecimal dealerPrice;
    private BigDecimal partnerPrice;
    private boolean isNew;
    private boolean isHit;
    private String picture;
    private String categoryName;
    private String createdAt;
    private String updatedAt;
}

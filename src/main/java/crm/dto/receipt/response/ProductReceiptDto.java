package crm.dto.receipt.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ProductReceiptDto {
    private Long id;
    private Long code;
    private String name;
    private Integer newCount;
    private BigDecimal purchasePrice;
    private BigDecimal purchasePriceResult;

    private BigDecimal retailPrice;
    private BigDecimal dealerPrice;
    private BigDecimal partnerPrice;
    private boolean isNew;
    private boolean isHit;
    private String picture;
    private String category;
    private String createdAt;
    private String updatedAt;

    private String description;

    private List<String> parameters = new ArrayList<>();

    public void addParameter(String parameter) {
        parameters.add(parameter);
    }

}

package crm.dto.receipt.request;

import crm.dto.location.response.LocationDto;
import crm.dto.provider.response.ProviderDto;
import crm.dto.store.response.StoreDto;
import crm.dto.receipt.response.ProductReceiptDto;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ReceiptUpsertRequest {

    private Long id;

    private String name;

    private LocalDateTime dateTime;

    private LocationDto locationDto;

    private StoreDto storeDto;

    private ProviderDto providerDto;

    private BigDecimal sum;

    private BigDecimal paid;

    private String comment;

    private List<ProductReceiptDto> products;

}

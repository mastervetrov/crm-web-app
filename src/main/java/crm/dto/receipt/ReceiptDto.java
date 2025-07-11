package crm.dto.receipt;

import crm.dto.location.LocationDto;
import crm.dto.provider.ProviderDto;
import crm.dto.store.StoreDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/**
 * Response Dto - contains receipt data.
 * Used for return data in controller.
 *
 * @see crm.service.receipt.ReceiptService
 * @see crm.controller.thymeleaf.html.store.receipt.ReceiptController
 * @see crm.model.receipt.Receipt
 */
@Data
public class ReceiptDto {
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

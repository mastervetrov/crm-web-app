package crm.request.receipt;

import crm.dto.location.LocationDto;
import crm.dto.provider.ProviderDto;
import crm.dto.receipt.ProductReceiptDto;
import crm.dto.receipt.ReceiptDto;
import crm.dto.store.StoreDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/**
 * Request - contains receipts data.
 * Used for save data in service.
 *
 * @see crm.service.receipt.ReceiptService
 * @see crm.model.receipt.Receipt
 * @see ReceiptDto
 */
@Data
public class ReceiptRequest {

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

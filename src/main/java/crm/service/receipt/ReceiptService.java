package crm.service.receipt;

import crm.dto.receipt.ReceiptDto;
import crm.mapper.receipt.ReceiptMapper;
import crm.model.receipt.Receipt;
import crm.repository.ReceiptRepository;
import crm.request.receipt.ReceiptRequest;
import crm.service.CrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * User settings CRUD service.
 * todo дополнить
 *
 * @see Receipt
 * @see ReceiptDto
 * @see ReceiptMapper
 * @see ReceiptRepository
 * @see ReceiptRequest
 */
@Service
@Slf4j
public class ReceiptService extends CrudService<
        ReceiptRequest,
        Receipt,
        ReceiptDto,
        ReceiptMapper,
        ReceiptRepository
        > {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link ReceiptMapper}
   * @param repository repository {@link ReceiptMapper}
   */
  public ReceiptService(ReceiptMapper mapper, ReceiptRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(Receipt entity) {
    return entity.getId();
  }
}
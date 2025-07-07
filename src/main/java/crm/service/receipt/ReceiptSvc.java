package crm.service.receipt;

import crm.dto.receipt.ReceiptDto;
import crm.request.receipt.ReceiptUpsertRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
* Interface - CRUD service for operations with entities Receipt.
*
* @see crm.repository.ReceiptRepository
* @see crm.model.receipt.Receipt
* @see crm.mapper.receipt.ReceiptMapper
* @see ReceiptUpsertRequest
* @see ReceiptDto
*/
@Service
public interface ReceiptSvc {

  /**
  * Finds all Receipt entities and maps them to ReceiptDto objects.
  * The result is returned as a paginated {@link Page} of {@link ReceiptDto}.
  *
  * @param pageNumber the page number to retrieve (0-based).
  * @param pageSize the number of items per page.
  * @return a {@link Page} containing {@link ReceiptDto} objects
  */
  Page<ReceiptDto> findAll(Integer pageNumber, Integer pageSize);

  /**
  * Method find Receipt entity by id and maps it to ReceiptDto object.
  * The result is returned as dto instance {@link ReceiptDto}.
  *
  * @param id target identifier
  * @return {@link ReceiptDto}
  */
  ReceiptDto findById(Long id);

  /**
  * Maps request to entity and save in {@link crm.repository.ReceiptRepository}.
  * The result entity is returned as dto instance {@link ReceiptDto}.
  *
  * @param request {@link ReceiptUpsertRequest}
  * @return {@link ReceiptDto}
  */
  ReceiptDto save(ReceiptUpsertRequest request);

  /**
  * Find entity by id and get from the {@link crm.repository.ReceiptRepository}.
  * The result entity is compared with request, after mapping.
  * If at least one field is different, an update occurs.
  * The output is updated entity in the form dto.
  *
  * @param id target identifier
  * @param request {@link ReceiptUpsertRequest}
  * @return {@link ReceiptDto}
  */
  ReceiptDto updateById(Long id, ReceiptUpsertRequest request);

  /**
  * Method for deleting entity by id.
  *
  * @param id target identifier.
  */
  void deleteById(Long id);
}

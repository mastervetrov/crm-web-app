package crm.mapper.receipt;

import crm.dto.receipt.ReceiptDto;
import crm.model.receipt.Receipt;
import crm.request.receipt.ReceiptUpsertRequest;
import crm.service.receipt.ReceiptSvc;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * Mapper for entity {@link Receipt}.
 *
 * @see Receipt
 * @see ReceiptDto
 * @see ReceiptUpsertRequest
 * @see ReceiptSvc
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReceiptMapper {

  /**
   * Mapping request {@link ReceiptUpsertRequest} to entity {@link Receipt}.
   * Used for preserving receipt.
   *
   * @param request contains data.
   * @return entity instance {@link Receipt} with id == null.
   */
  Receipt requestToEntity(ReceiptUpsertRequest request);

  /**
   * Mapping request {@link ReceiptUpsertRequest} to entity {@link Receipt},
   * setting specified id.
   *
   * @param id identifier, to be set in the entity.
   * @param request contains data.
   * @return entity instance {@link Receipt} with installed id.
   */
  Receipt requestToEntity(Long id, ReceiptUpsertRequest request);

  /**
   * Mapping entity {@link Receipt} to dto {@link ReceiptDto}.
   * Used, when getting receipt.
   *
   * @param receipt - contains data.
   * @return dto instance {@link ReceiptDto}.
   */
  ReceiptDto receiptToReceiptDto(Receipt receipt);

  /**
   * Mapping list entity {@link Receipt} to list dto {@link ReceiptDto}.
   * Used, when getting receipt list.
   *
   * @param receiptList list entities..
   * @return list dto.
   */
  List<ReceiptDto> receiptListToReceiptDtoList(List<Receipt> receiptList);

  /**
   * Mapping receipt page {@link Receipt} to receipt dto page {@link ReceiptDto}.
   * Used, when getting receipt dto page.
   *
   * @param receiptPage - page entities {@link Receipt}.
   * @return page dto {@link ReceiptDto}.
   */
  default Page<ReceiptDto> receiptPageToReceiptDtoPage(Page<Receipt> receiptPage) {
    List<Receipt> receiptList = receiptPage.getContent();
    List<ReceiptDto> receiptDtoList = receiptListToReceiptDtoList(receiptList);
    Pageable pageable = receiptPage.getPageable();
    Integer totalPages = receiptPage.getTotalPages();
    Page<ReceiptDto> receiptDtoPage = new PageImpl<>(receiptDtoList, pageable, totalPages);
    return receiptDtoPage;
  }
}

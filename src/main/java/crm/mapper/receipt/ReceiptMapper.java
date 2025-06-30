package crm.mapper.receipt;

import crm.dto.receipt.response.ReceiptDto;
import crm.dto.receipt.request.ReceiptUpsertRequest;
import crm.model.receipt.Receipt;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReceiptMapper {

    Receipt receiptRequestToReceipt(ReceiptUpsertRequest request);

    Receipt receiptRequestToReceipt(Long id, ReceiptUpsertRequest request);

    ReceiptDto receiptToReceiptDto(Receipt receipt);

    List<ReceiptDto> receiptListToReceiptDtoList(List<Receipt> receiptList);

    default Page<ReceiptDto> receiptPageToReceiptDtoPage(Page<Receipt> receiptPage) {
        List<Receipt> receiptList = receiptPage.getContent();
        List<ReceiptDto> receiptDtoList = receiptListToReceiptDtoList(receiptList);
        Page<ReceiptDto> receiptDtoPage = new PageImpl<>(receiptDtoList, receiptPage.getPageable(), receiptPage.getTotalPages());
        return receiptDtoPage;
    }
}

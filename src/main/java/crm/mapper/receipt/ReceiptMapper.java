package crm.mapper.receipt;

import crm.dto.receipt.ReceiptDto;
import crm.mapper.BaseMapper;
import crm.model.receipt.Receipt;
import crm.request.receipt.ReceiptRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link Receipt}.
 *
 * @see Receipt
 * @see ReceiptDto
 * @see ReceiptRequest
 * @see crm.service.receipt.ReceiptService
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReceiptMapper extends BaseMapper<ReceiptRequest, Receipt, ReceiptDto> {}

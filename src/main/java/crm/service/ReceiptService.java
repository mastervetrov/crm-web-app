package crm.service;

import crm.dto.receipt.response.ReceiptDto;
import crm.dto.receipt.request.ReceiptUpsertRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface ReceiptService {

    Page<ReceiptDto> findAll(Integer pageNumber, Integer pageSize);

    ReceiptDto findById(Long id);

    ReceiptDto save(ReceiptUpsertRequest request);

    ReceiptDto updateById(Long id, ReceiptUpsertRequest request);

    void deleteById(Long id);
 }

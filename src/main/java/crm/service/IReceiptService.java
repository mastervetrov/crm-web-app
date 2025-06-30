package crm.service;

import crm.dto.receipt.response.ReceiptDto;
import crm.dto.receipt.request.ReceiptUpsertRequest;
import crm.exception.receipt.ReceiptEntityNotFoundException;
import crm.mapper.receipt.ReceiptMapper;
import crm.model.receipt.Receipt;
import crm.repository.ReceiptRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class IReceiptService implements ReceiptService{

    private final ReceiptRepository receiptRepository;
    private final ReceiptMapper receiptMapper;

    @Override
    public Page<ReceiptDto> findAll(Integer pageNumber, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Receipt> receiptPage = receiptRepository.findAll(pageable);
        Page<ReceiptDto> receiptDtoPage = receiptMapper.receiptPageToReceiptDtoPage(receiptPage);
        return receiptDtoPage;
    }

    @Override
    public ReceiptDto findById(Long id) {
        Receipt receipt = receiptRepository.findById(id).orElseThrow(() -> { throw new ReceiptEntityNotFoundException("Поступление с идентификатором " + id + " не найдено");});
        ReceiptDto receiptDto = receiptMapper.receiptToReceiptDto(receipt);
        return receiptDto;
    }

    @Override
    public ReceiptDto save(ReceiptUpsertRequest request) {
        Receipt receipt = receiptRepository.save(receiptMapper.receiptRequestToReceipt(request));
        return receiptMapper.receiptToReceiptDto(receipt);
    }

    @Override
    public ReceiptDto updateById(Long id, ReceiptUpsertRequest request) {
        receiptRepository.findById(id).orElseThrow(() -> { throw new ReceiptEntityNotFoundException("Поступление с идентификатором " + id + " не найдено");});
        Receipt savedReceipt = receiptRepository.save(receiptMapper.receiptRequestToReceipt(id, request));
        return receiptMapper.receiptToReceiptDto(savedReceipt);
    }

    @Override
    public void deleteById(Long id) {
        receiptRepository.findById(id).orElseThrow(() -> { throw new ReceiptEntityNotFoundException("Поступление с идентификатором " + id + " не найдено");});
        receiptRepository.deleteById(id);
    }
}
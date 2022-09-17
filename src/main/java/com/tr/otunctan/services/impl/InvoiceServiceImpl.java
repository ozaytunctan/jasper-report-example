package com.tr.otunctan.services.impl;

import com.tr.otunctan.dto.InvoiceDto;
import com.tr.otunctan.repository.InvoiceRepository;
import com.tr.otunctan.services.InvoiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;


    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;


    }


    @Override
    public List<InvoiceDto> getInvoicesByUserId(Long userId) {
        return this.invoiceRepository.findAllByUserId(userId);
    }
}

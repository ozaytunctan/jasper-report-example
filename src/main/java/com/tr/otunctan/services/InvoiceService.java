package com.tr.otunctan.services;

import com.tr.otunctan.dto.InvoiceDto;

import java.util.List;

public interface InvoiceService {

    List<InvoiceDto> getInvoicesByUserId(Long userId);
}

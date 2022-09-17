package com.tr.otunctan.controller;

import com.tr.otunctan.dto.InvoiceDto;
import com.tr.otunctan.services.InvoiceService;
import com.tr.otunctan.util.JasperReportUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/v1/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping(path = "/pdf")
    public ResponseEntity<byte[]> getAllInvoiceByUserId(@RequestParam(name = "userId") Long userId) {
        byte[] reportPdf = JasperReportUtils.createReportPdf("invoice.jrxml",
                this.invoiceService.getInvoicesByUserId(userId),
                new HashMap<String, Object>()
        );
        HttpHeaders headers = new HttpHeaders();
//        headers.set(HttpHeaders.CONTENT_DISPOSITION, "inline;filename=invoice.pdf");
        headers.set(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=invoice.pdf");
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).headers(headers).body(reportPdf);
    }
}

package com.tr.otunctan.startup;

import com.tr.otunctan.entity.Invoice;
import com.tr.otunctan.repository.InvoiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final InvoiceRepository invoiceRepository;

    public DataSeeder(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Invoice> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(
                    Invoice.of(1L,
                            "Ad " + i,
                            "Soyad " + i,
                            new BigDecimal(i),
                            "05380110467",
                            "ozaytunctan@gmail.com"
                    )
            );
        }

        this.invoiceRepository.saveAll(list);

    }
}

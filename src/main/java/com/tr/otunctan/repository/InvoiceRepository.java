package com.tr.otunctan.repository;

import com.tr.otunctan.dto.InvoiceDto;
import com.tr.otunctan.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

    @Query(value = "select new com.tr.otunctan.dto.InvoiceDto(inv.id,inv.firstName,inv.lastName,inv.amount,inv.email,inv.phone) from Invoice inv ")
   List<InvoiceDto> findAllByUserId(@Param("userId")Long userId);
}

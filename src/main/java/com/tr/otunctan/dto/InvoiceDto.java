package com.tr.otunctan.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class InvoiceDto implements Serializable {

    private Long id;
    private String firstName;

    private String lastName;

    private BigDecimal amount;

    private String phone;

    private String email;

    public InvoiceDto(){}
    public InvoiceDto(Long id, String firstName, String lastName, BigDecimal amount,  String email,String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

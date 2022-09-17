package com.tr.otunctan.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "invoice")
public class Invoice extends BaseEntity<Long> {


    private Long userId;

    private String firstName;

    private String lastName;

    private BigDecimal amount;

    private String phone;

    private String email;


    public Invoice() {
        super(0L);
    }

    public Invoice(Long id) {
        super(id);
    }

    public Invoice(Long userId, String firstName, String lastName, BigDecimal amount, String phone, String email) {
        super(0L);
        this.userId = userId;
        this.firstName = firstName;
        this.lastName=lastName;
        this.amount = amount;
        this.phone = phone;
        this.email = email;
    }

    public static Invoice of(Long userId, String firstName,
                             String lastName,
                             BigDecimal amount,
                             String phone,
                             String email) {
        return new Invoice(userId, firstName, lastName, amount, phone, email);
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

    @Override
    public String toString() {
        return "Invoice{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amount=" + amount +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

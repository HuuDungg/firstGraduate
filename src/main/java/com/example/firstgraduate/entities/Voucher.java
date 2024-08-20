package com.example.firstgraduate.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Voucher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;
    @Basic
    @Column(name = "discount_amount", nullable = true, length = 255)
    private String discountAmount;
    @Basic
    @Column(name = "discount_percent", nullable = true, length = 255)
    private String discountPercent;
    @Basic
    @Column(name = "expiration_date", nullable = true)
    private Date expirationDate;
    @Basic
    @Column(name = "min_purchase_amount", nullable = true, length = 255)
    private String minPurchaseAmount;
    @Basic
    @Column(name = "max_discount_amount", nullable = true, length = 255)
    private String maxDiscountAmount;
    @Basic
    @Column(name = "terms_and_conditions", nullable = true, length = 255)
    private String termsAndConditions;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "voucherByVoucherId")
    private Collection<CustomerVoucher> customerVouchersById;
    @OneToMany(mappedBy = "voucherByVoucherId")
    private Collection<Orders> ordersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(String discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMinPurchaseAmount() {
        return minPurchaseAmount;
    }

    public void setMinPurchaseAmount(String minPurchaseAmount) {
        this.minPurchaseAmount = minPurchaseAmount;
    }

    public String getMaxDiscountAmount() {
        return maxDiscountAmount;
    }

    public void setMaxDiscountAmount(String maxDiscountAmount) {
        this.maxDiscountAmount = maxDiscountAmount;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return id == voucher.id && Objects.equals(code, voucher.code) && Objects.equals(discountAmount, voucher.discountAmount) && Objects.equals(discountPercent, voucher.discountPercent) && Objects.equals(expirationDate, voucher.expirationDate) && Objects.equals(minPurchaseAmount, voucher.minPurchaseAmount) && Objects.equals(maxDiscountAmount, voucher.maxDiscountAmount) && Objects.equals(termsAndConditions, voucher.termsAndConditions) && Objects.equals(status, voucher.status) && Objects.equals(createdAt, voucher.createdAt) && Objects.equals(updatedAt, voucher.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, discountAmount, discountPercent, expirationDate, minPurchaseAmount, maxDiscountAmount, termsAndConditions, status, createdAt, updatedAt);
    }

    public Collection<CustomerVoucher> getCustomerVouchersById() {
        return customerVouchersById;
    }

    public void setCustomerVouchersById(Collection<CustomerVoucher> customerVouchersById) {
        this.customerVouchersById = customerVouchersById;
    }

    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }
}

package com.example.firstgraduate.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "payment_date", nullable = true)
    private Date paymentDate;
    @Basic
    @Column(name = "payment_method", nullable = true, length = 50)
    private String paymentMethod;
    @Basic
    @Column(name = "amount", nullable = true)
    private Integer amount;
    @Basic
    @Column(name = "order_id", nullable = true)
    private Integer orderId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return id == payment.id && Objects.equals(paymentDate, payment.paymentDate) && Objects.equals(paymentMethod, payment.paymentMethod) && Objects.equals(amount, payment.amount) && Objects.equals(orderId, payment.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paymentDate, paymentMethod, amount, orderId);
    }
}

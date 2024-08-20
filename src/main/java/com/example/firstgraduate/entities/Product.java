package com.example.firstgraduate.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "code", nullable = true, length = 255)
    private String code;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    private Double price;
    @Basic
    @Column(name = "collar", nullable = true, length = 255)
    private String collar;
    @Basic
    @Column(name = "sleeve", nullable = true, length = 255)
    private String sleeve;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<CartDetail> cartDetailsById;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category categoryByCategoryId;
    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    private Brand brandByBrandId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<ProductDetail> productDetailsById;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<ProductImage> productImagesById;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Product product = (Product) o;
        return id == product.id && Objects.equals(code, product.code) && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(collar, product.collar) && Objects.equals(sleeve, product.sleeve) && Objects.equals(description, product.description) && Objects.equals(createdAt, product.createdAt) && Objects.equals(updatedAt, product.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, price, collar, sleeve, description, createdAt, updatedAt);
    }

    public Collection<CartDetail> getCartDetailsById() {
        return cartDetailsById;
    }

    public void setCartDetailsById(Collection<CartDetail> cartDetailsById) {
        this.cartDetailsById = cartDetailsById;
    }

    public Category getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(Category categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    public Brand getBrandByBrandId() {
        return brandByBrandId;
    }

    public void setBrandByBrandId(Brand brandByBrandId) {
        this.brandByBrandId = brandByBrandId;
    }

    public Collection<ProductDetail> getProductDetailsById() {
        return productDetailsById;
    }

    public void setProductDetailsById(Collection<ProductDetail> productDetailsById) {
        this.productDetailsById = productDetailsById;
    }

    public Collection<ProductImage> getProductImagesById() {
        return productImagesById;
    }

    public void setProductImagesById(Collection<ProductImage> productImagesById) {
        this.productImagesById = productImagesById;
    }
}

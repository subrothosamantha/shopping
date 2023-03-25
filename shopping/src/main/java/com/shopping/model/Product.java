package com.shopping.model;

import com.shopping.model.enums.ProductType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(nullable = false)
    public String name;
    public String description;
    public List<String> images;
    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public ProductType productType;
    @Column(nullable = false)
    public String price;
    public int stock_available;
    @Column(nullable = false)
    public String seller;

    public Product() {
    }

    public Product(long id, String name, String description, List<String> images, ProductType productType, String price, int stock_available, String seller) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.images = images;
        this.productType = productType;
        this.price = price;
        this.stock_available = stock_available;
        this.seller = seller;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStock_available() {
        return stock_available;
    }

    public void setStock_available(int stock_available) {
        this.stock_available = stock_available;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", images=" + images +
                ", productType=" + productType +
                ", price='" + price + '\'' +
                ", stock_available=" + stock_available +
                ", seller='" + seller + '\'' +
                '}';
    }
}

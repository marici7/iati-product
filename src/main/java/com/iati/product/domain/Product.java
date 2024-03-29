package com.iati.product.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int price;

    @Column(columnDefinition = "text")
    private String description;

    @Column(nullable = false)
    private String provider;

    @Column(nullable = false)
    private Boolean isDiscounted;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private ProductStatus status = ProductStatus.STOCKED;

    @Column
    private String imageUrl;

    @ManyToMany(mappedBy = "products")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Boolean getDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(Boolean discounted) {
        isDiscounted = discounted;
    }
}

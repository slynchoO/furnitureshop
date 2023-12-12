package com.furnitureshop.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carts")
public class Cart extends BaseEntity {
    //Cart includes each product added to the
    //shopping cart and the quantity of the product.

    @OneToOne
    private User shopper;
    private Integer quantity;

    public Cart() {
    }

    public User getShopper() {
        return shopper;
    }

    public void setShopper(User shopper) {
        this.shopper = shopper;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

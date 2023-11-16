package com.furnitureshop.model.entity;

import com.furnitureshop.model.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "carts")
public class Cart extends BaseEntity {
    //Cart includes each product added to the
    //shopping cart and the quantity of the product.

    @OneToOne
    private Customer shopper;
    private Integer quantity;

    public Cart() {
    }

    public Customer getShopper() {
        return shopper;
    }

    public void setShopper(Customer shopper) {
        this.shopper = shopper;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

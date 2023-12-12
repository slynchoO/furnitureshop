package com.furnitureshop.model.entity;

import com.furnitureshop.model.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {
    private LocalDateTime orderDate;

    @ManyToOne
    private User customer;

    @ManyToMany
    private List<Product> furnitureItems;

    private BigDecimal totalAmount;
    private OrderStatus status;

    public Order() {
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public List<Product> getFurnitureItems() {
        return furnitureItems;
    }

    public void setFurnitureItems(List<Product> furnitureItems) {
        this.furnitureItems = furnitureItems;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}

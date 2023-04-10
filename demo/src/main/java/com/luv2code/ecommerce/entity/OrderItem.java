package com.luv2code.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long id;

    @Column(name="image_url")
    public String imageUrl;

    @Column(name="unit_price")
    public BigDecimal unitPrice;

    @Column(name="quantity")
    public int quantity;

    @Column(name="product_id")
    public Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    public Order order;

}









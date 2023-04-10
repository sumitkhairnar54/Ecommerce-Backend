package com.luv2code.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long id;

    @Column(name="street")
    public String street;

    @Column(name="city")
    public String city;

    @Column(name="state")
    public String state;

    @Column(name="country")
    public String country;

    @Column(name="zip_code")
    public String zipCode;

    @OneToOne
    @PrimaryKeyJoinColumn
    public OrderItem order;
}






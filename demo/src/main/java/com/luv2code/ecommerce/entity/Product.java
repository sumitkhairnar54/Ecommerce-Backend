package com.luv2code.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name= "product")
@Data

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	public Long id;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	public ProductCategory category;
	
	@Column(name= "sku")
	public String sku;
	
	@Column(name= "name")
	public String name;
	
	@Column(name= "description")
	public String description;
	
	@Column(name= "unit_price")
	public BigDecimal unitPrice;
	
	@Column(name= "image_url")
	public String imageUrl;
	
	@Column(name= "active")
	public boolean active;
	
	@Column(name= "units_in_stock")
	public int unitsInStock;
	
	@Column(name= "date_created")
	@CreationTimestamp
	public Date dateCreated;
	
	@Column(name= "last_updated")
	@UpdateTimestamp
	public Date lastUpdated;

	
}

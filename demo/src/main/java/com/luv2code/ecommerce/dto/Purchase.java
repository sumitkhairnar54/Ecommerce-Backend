package com.luv2code.ecommerce.dto;

import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.Customer;
import com.luv2code.ecommerce.entity.Order;
import com.luv2code.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

	public Customer customer;
	public Address shippingAddress;
	public Address billingAddress;
	public Order order;
	public Set<OrderItem> orderItems;

}

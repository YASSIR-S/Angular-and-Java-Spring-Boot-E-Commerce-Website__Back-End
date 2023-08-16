package com.ecommerce.springbootecommerce.dto;

import com.ecommerce.springbootecommerce.Entity.Address;
import com.ecommerce.springbootecommerce.Entity.Customer;
import com.ecommerce.springbootecommerce.Entity.Order;
import com.ecommerce.springbootecommerce.Entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;

    private Set<OrderItem> orderItems;

}

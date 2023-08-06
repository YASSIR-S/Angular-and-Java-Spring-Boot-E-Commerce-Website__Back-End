package com.springbootecommerce.springbootecommerce.dto;

import com.springbootecommerce.springbootecommerce.entity.Address;
import com.springbootecommerce.springbootecommerce.entity.Customer;
import com.springbootecommerce.springbootecommerce.entity.OrderItem;
import jakarta.persistence.criteria.Order;
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
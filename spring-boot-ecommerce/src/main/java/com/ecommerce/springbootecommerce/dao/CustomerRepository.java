package com.ecommerce.springbootecommerce.dao;

import com.ecommerce.springbootecommerce.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByEmail(String theEmail);
}

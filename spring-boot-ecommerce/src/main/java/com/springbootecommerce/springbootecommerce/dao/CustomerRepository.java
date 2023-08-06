package com.springbootecommerce.springbootecommerce.dao;

import com.springbootecommerce.springbootecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

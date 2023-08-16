package com.ecommerce.springbootecommerce.dao;

import com.ecommerce.springbootecommerce.Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {

    Page<Product> findByCategoryId(@Param("id") Long id , Pageable pageable);

    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}

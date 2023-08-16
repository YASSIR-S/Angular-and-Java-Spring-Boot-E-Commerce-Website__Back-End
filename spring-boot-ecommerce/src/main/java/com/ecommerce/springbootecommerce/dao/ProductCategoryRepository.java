package com.ecommerce.springbootecommerce.dao;

import com.ecommerce.springbootecommerce.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product_category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}

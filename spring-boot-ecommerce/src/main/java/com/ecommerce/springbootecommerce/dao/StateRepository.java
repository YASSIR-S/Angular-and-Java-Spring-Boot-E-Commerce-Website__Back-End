package com.ecommerce.springbootecommerce.dao;

import com.ecommerce.springbootecommerce.Entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State,Integer> {
    List<State> findByCountryCode(@Param("code") String code);

}

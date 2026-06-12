package com.educandoweb.webservices.repositories;

import com.educandoweb.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}

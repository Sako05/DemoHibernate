package com.example.demo.repositories;


import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByPrice (String price);
    List<Product> findByProductName (String productName);
    List<Product> findByProductNameAndPrice (Long price, String productName);


}

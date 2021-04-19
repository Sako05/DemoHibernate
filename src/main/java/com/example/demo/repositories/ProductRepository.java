package com.example.demo.repositories;
import java.util.List;
import com.example.demo.model.*;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByTitle(String title);
    List<Product> findByAuthor(String author);
    List<Product> findByTitleAndAuthor(String title, String author);
    Product findById(long id);



}
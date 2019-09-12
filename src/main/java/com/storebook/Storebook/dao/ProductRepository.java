package com.storebook.Storebook.dao;

import com.storebook.Storebook.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Override
    List<Product> findAll();

    @Override
    Product getOne(Integer integer);
}

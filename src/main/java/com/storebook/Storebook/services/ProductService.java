package com.storebook.Storebook.services;

import com.storebook.Storebook.dao.Dao;
import com.storebook.Storebook.models.Product;

import java.util.List;

public class ProductService {
    private Dao<Product> productDao;

    public ProductService() {}

    public Product getProduct(int id) { return productDao.getById(id); }

    public void saveProduct(Product product) { productDao.save(product);}

    public void deleteProduct(Product product) { productDao.delete(product);}

    public void updateProduct(Product product) {productDao.update(product);}

    public List<Product> getAllProducts() { return productDao.getAll(); }
}

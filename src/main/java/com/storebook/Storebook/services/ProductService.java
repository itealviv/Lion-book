package com.storebook.Storebook.services;

import com.storebook.Storebook.dao.ProductRepository;
import com.storebook.Storebook.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository productDao;


    /*    public Product getProduct(int id) { return productDao.getOne(id); }

    public void saveProduct(Product product) { productDao.save(product);}

    public void deleteProduct(Product product) { productDao.delete(product);}

    public void updateProduct(Product product) {productDao.save(product);}*/

    public List<Product> getAllProducts() { return productDao.findAll(); }

    public Product getProduct(int id) { return productDao.getOne(id); }


}

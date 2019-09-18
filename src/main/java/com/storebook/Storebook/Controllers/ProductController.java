package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.models.Product;
import com.storebook.Storebook.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @CrossOrigin(origins = "http://store-book.tk")
    @GetMapping("/products")
    public List<Product> getMedia() {
        return productService.getAllProducts();
    }

    @CrossOrigin(origins = "http://store-book.tk")
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @CrossOrigin(origins = "http://store-book.tk")
    @GetMapping("/product/{id}/author")
    public Product getProductAuthorById(@PathVariable int id) {
        return productService.getProduct(id);
    }


}

package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.models.Product;
import com.storebook.Storebook.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@CrossOrigin
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getMedia() {

        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @GetMapping("/product/{id}/author")
    public Product getProductAuthorById(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {

    }

    @PostMapping("/products/add")
    String newProduct(@RequestBody Product newProduct) throws URISyntaxException {

        return "{\"result\":\"ok\"}";
    }

    @PutMapping("/products/{id}")
    String replaceProduct(@RequestBody Product newProduct) throws URISyntaxException {


        return "{\"result\":\"ok\"}";
    }

    @DeleteMapping("/employees/{id}")
    String deleteProduct(@PathVariable Long id) {


        return "{\"result\":\"ok\"}";

    }
}

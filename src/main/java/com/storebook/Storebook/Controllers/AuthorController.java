package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.models.Author;
import com.storebook.Storebook.models.Product;
import com.storebook.Storebook.services.AuthorService;
import com.storebook.Storebook.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @Autowired
    private ProductService productService;

    @GetMapping("/authors")
    public ResponseEntity<List<Author>>  getAuthors() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");

        return new ResponseEntity<List<Author>>(authorService.getAllAuthors(),headers, HttpStatus.OK);
    }


    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable int id) { return authorService.getById(id);}


    @GetMapping("/author/{id}/books")
    public List<Product> getProducts(@PathVariable int id) { return productService.findAllByAuthor(id);}

}

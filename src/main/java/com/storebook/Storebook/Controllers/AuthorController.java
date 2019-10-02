package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.loggers.LoggerInterface;
import com.storebook.Storebook.models.Author;
import com.storebook.Storebook.models.Product;
import com.storebook.Storebook.services.AuthorService;
import com.storebook.Storebook.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class AuthorController implements LoggerInterface{

    private AuthorService authorService;

    private ProductService productService;

    @Autowired
    public AuthorController(AuthorService authorService, ProductService productService) {
        this.authorService = authorService;
        this.productService = productService;
    }

    @GetMapping("/authors")
    public List<Author>  getAuthors() {
        LoggerInterface.getLogger("AuthorController").log(DIAG,"GET authors");
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable int id) {
        Author author = authorService.getById(id);
        return author;
    }


    @GetMapping("/author/{id}/books")
    public List<Product> getProducts(@PathVariable int id) { return productService.findAllByAuthor(id);}

}

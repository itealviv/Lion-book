package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.models.Author;
import com.storebook.Storebook.models.Product;
import com.storebook.Storebook.services.AuthorService;
import com.storebook.Storebook.services.ProductService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class AuthorController {
    final Level DIAG = Level.forName("DIAG", 50);

    private static final Logger LOGGER = LogManager.getLogger("AuthorController");

    @Autowired
    private AuthorService authorService;

    @Autowired
    private ProductService productService;



    @GetMapping("/authors")
    public List<Author>  getAuthors() {
        LOGGER.log(DIAG,"GET authors");
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable int id) {
        Author author = authorService.getById(id);
        author.setProducts(productService.findAllByAuthor(id));
        return author;
    }


    @GetMapping("/author/{id}/books")
    public List<Product> getProducts(@PathVariable int id) { return productService.findAllByAuthor(id);}

}

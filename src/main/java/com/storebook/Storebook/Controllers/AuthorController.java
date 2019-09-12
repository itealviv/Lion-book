package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.models.Author;
import com.storebook.Storebook.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAuthors() {return authorService.getAllAuthors();}

    @GetMapping("/author/{id}")
    public Author getAuthor(@PathVariable int id) { return authorService.getById(id);}
}

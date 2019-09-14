package com.storebook.Storebook.services;

import com.storebook.Storebook.dao.AuthorRepository;
import com.storebook.Storebook.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() { return authorRepository.findAll(); }

    public Author getById(int id) { return authorRepository.getOne(id); }
}

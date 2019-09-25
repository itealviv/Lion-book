package com.storebook.Storebook.services;

import com.storebook.Storebook.dao.CategoryRepository;
import com.storebook.Storebook.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategories() { return categoryRepository.findAll(); }

    public Category getById(int id) { return categoryRepository.getOne(id); }
}

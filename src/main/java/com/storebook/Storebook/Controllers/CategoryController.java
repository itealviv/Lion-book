package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.loggers.LoggerInterface;
import com.storebook.Storebook.models.Category;
import com.storebook.Storebook.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.storebook.Storebook.loggers.LoggerInterface.DIAG;

@CrossOrigin
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/categories")
    public List<Category> getCategory() {
        LoggerInterface.getLogger("CategoryController").log(DIAG, "GET categories");
        return categoryService.getAllCategories();
    }
    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable int id) {
        return categoryService.getById(id);
    }
}

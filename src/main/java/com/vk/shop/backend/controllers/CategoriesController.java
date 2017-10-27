package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Category;
import com.vk.shop.backend.data.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriesController {
    @Autowired
    private CategoryRepository repository;

    @CrossOrigin
    @RequestMapping("/categories")
    public List<Category> getAll(){
        return repository.findAll();
    }
}

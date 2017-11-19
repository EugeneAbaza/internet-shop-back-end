package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Laptop;
import com.vk.shop.backend.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/goods/laptop")
public class LaptopController {
    @Autowired
    private LaptopService service;

    @RequestMapping("/{id}")
    public Laptop findAllById(@PathVariable("id") long id){
        return service.findById(id);
    }
}

package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Cpu;
import com.vk.shop.backend.services.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/goods/cpu")
public class CpuController {
    @Autowired
    private CpuService service;

    @RequestMapping("/{id}")
    public Cpu findById(@PathVariable("id") long id){
        return service.findById(id);
    }
}

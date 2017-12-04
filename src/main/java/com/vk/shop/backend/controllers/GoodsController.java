package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Goods;
import com.vk.shop.backend.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService service;

    @RequestMapping(value = "/category/{id}")
    public Page<Goods> findAllByCategoryId(
            @PathVariable("id") int id,
            @RequestParam("page") int page,
            @RequestParam("pricefrom") int priceFrom,
            @RequestParam("priceto") int priceTo){
        return service.findAllByCategoryId(id, page, priceFrom, priceTo);
    }

    @RequestMapping(path = "/search", method = RequestMethod.POST)
    public Page<Goods> search(@RequestBody String title){
        //TODO сменить статически заданную страницу
        return service.findAllByNameLike(title, 0);
    }

    @RequestMapping("/{id}")
    public Goods findAllById(@PathVariable("id") long id){
        return service.findAllById(id);
    }
}

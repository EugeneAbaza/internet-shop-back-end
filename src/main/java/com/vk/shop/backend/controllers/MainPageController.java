package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Goods;
import com.vk.shop.backend.services.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/main")
public class MainPageController {
    @Autowired
    private GoodsService service;

    @RequestMapping("/discount")
    public List<Goods> getByDiscount(){
        return service.findTop4ByDiscountGreaterThan(0, new Sort(Sort.Direction.DESC, "discount"));
    }

    @RequestMapping("/top")
    public List<Goods> getTop(){
        return service.findTop4ByOrderBySalesDesc();
    }

    @RequestMapping("/newest")
    public List<Goods> getNewest(){
        return service.findTop4ByOrderByDateDesc();
    }
}

package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Goods;
import com.vk.shop.backend.data.repositories.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/main")
public class MainPageController {
    @Autowired
    private GoodsRepository repository;

    @CrossOrigin
    @RequestMapping("/discount")
    public List<Goods> getGoods(){
        return repository.findTop4ByDiscountGreaterThan(0, new Sort(Sort.Direction.DESC, "discount"));
    }

    @CrossOrigin
    @RequestMapping("/top")
    public List<Goods> getTop(){
        return repository.findTop4ByOrderBySalesDesc();
    }

    @CrossOrigin
    @RequestMapping("/newest")
    public List<Goods> getNewest(){
        return repository.findTop4ByOrderByDateDesc();
    }
}

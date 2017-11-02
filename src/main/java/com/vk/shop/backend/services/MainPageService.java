package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.Goods;
import com.vk.shop.backend.data.repositories.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainPageService {
    @Autowired
    private GoodsRepository repository;

    public List<Goods> findTop4ByDiscountGreaterThan(int discount, Sort sort){
        return repository.findTop4ByDiscountGreaterThan(discount, sort);
    }

    public List<Goods> findTop4ByOrderBySalesDesc(){
        return repository.findTop4ByOrderBySalesDesc();
    }

    public List<Goods> findTop4ByOrderByDateDesc(){
        return repository.findTop4ByOrderByDateDesc();
    }
}

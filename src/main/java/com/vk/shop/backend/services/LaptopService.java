package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.Laptop;
import com.vk.shop.backend.data.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repository;

    public Laptop findById(long id){
        return repository.findAllByGoodsId(id);
    }
}

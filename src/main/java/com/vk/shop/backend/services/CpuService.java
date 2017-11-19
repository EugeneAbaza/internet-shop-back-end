package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.Cpu;
import com.vk.shop.backend.data.repositories.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CpuService {
    @Autowired
    private CpuRepository repository;

    public Cpu findById(long id){
        return repository.findAllByGoodsId(id);
    }
}

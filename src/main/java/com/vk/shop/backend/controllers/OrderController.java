package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Order;
import com.vk.shop.backend.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @RequestMapping("/{id}")
    public List<Order> findAll(@PathVariable long id){
        return service.findAllByUserId(id);
    }

    @RequestMapping("/create")
    public int createOrder(@RequestBody Order order){
        service.createOrder(order);
        return 0;
    }
}

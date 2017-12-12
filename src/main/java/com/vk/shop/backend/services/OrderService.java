package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.Order;
import com.vk.shop.backend.data.entities.OrderList;
import com.vk.shop.backend.data.repositories.OrderListRepository;
import com.vk.shop.backend.data.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Autowired
    private OrderListRepository orderListRepository;

    public List<Order> findAllByUserId(long id){
        return repository.findAllByUserId(id);
    }

    public void createOrder(Order order) {
        Set<OrderList> goodsList = order.getGoodsList();
        order.setGoodsList(new HashSet<>());
        long id = repository.save(order).getId();
        for(OrderList l : goodsList){
            l.setOrder(id);
        }
        orderListRepository.save(goodsList);
    }
}

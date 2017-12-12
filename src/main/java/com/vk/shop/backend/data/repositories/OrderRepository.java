package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByUserId(long id);
}

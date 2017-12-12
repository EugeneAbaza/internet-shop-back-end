package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListRepository extends JpaRepository<OrderList, Long> {
}

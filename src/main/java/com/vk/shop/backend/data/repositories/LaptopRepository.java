package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    Laptop findAllByGoodsId(long id);
}

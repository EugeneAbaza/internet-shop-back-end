package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Goods;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findTop4ByDiscountGreaterThan(long discount, Sort sort);
    List<Goods> findTop4ByOrderBySalesDesc();
    List<Goods> findTop4ByOrderByDateDesc();
}

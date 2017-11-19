package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CpuRepository extends JpaRepository<Cpu, Long> {
    Cpu findAllByGoodsId(long id);
}

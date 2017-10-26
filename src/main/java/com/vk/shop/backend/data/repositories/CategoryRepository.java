package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

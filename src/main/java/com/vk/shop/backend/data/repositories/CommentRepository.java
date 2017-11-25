package com.vk.shop.backend.data.repositories;

import com.vk.shop.backend.data.entities.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comments, Long> {
    List<Comments> findAllByGoodsId(long id);
}

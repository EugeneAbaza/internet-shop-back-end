package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.Comments;
import com.vk.shop.backend.data.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {
    @Autowired
    private CommentRepository repository;

    public List<Comments> findAllByGoodsId(long id){
        return repository.findAllByGoodsId(id);
    }

    public void addComment(Comments comments){
        repository.save(comments);
    }
}

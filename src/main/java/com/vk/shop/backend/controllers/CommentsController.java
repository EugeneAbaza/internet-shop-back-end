package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.Comments;
import com.vk.shop.backend.services.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentsService service;

    @RequestMapping("/{id}")
    public List<Comments> findAllByGoodsId(@PathVariable("id") long id){
        return service.findAllByGoodsId(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public int addComment(@RequestBody Comments comments){
        service.addComment(comments);
        return 0;
    }
}

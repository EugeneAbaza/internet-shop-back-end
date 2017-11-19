package com.vk.shop.backend.controllers;

import com.vk.shop.backend.data.entities.User;
import com.vk.shop.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/account")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public int logIn(@RequestBody User user){
        return service.logIn(user);
    }

    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public int registration(@RequestBody User user){
        return service.registration(user);
    }

    @RequestMapping(path = "/logout", method = RequestMethod.POST)
    public int logOut(@RequestBody String email){
        return service.logOut(email);
    }
}

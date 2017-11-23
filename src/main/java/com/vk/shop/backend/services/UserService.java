package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.User;
import com.vk.shop.backend.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public int logIn(User user){
        User u = repository.findByEmailEquals(user.getEmail());
        if(u == null){
            return 1;//user not found
        } else {
            if(user.getEmail().equals(u.getEmail()) && user.getPassword().equals(u.getPassword())) {
                return 0;//authorized
            }
            else {
                return 2;//invalid login or password
            }
        }
    }

    public int registration(User user) {
        User u = repository.findByEmailEquals(user.getEmail());
        if(u == null){
            repository.save(user);
            return 0;//successfully
        }
        return 1;//user already exist
    }
}

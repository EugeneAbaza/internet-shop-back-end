package com.vk.shop.backend.services;

import com.vk.shop.backend.data.entities.User;
import com.vk.shop.backend.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    private MessageDigest digest;

    public UserService() {
        try {
            digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public int logIn(User user){
        User u = repository.findByEmailEquals(user.getEmail());
        if(u == null){
            return 1;//user not found
        } else {
            byte[] digest1 = digest.digest(user.getPassword().getBytes());
            BigInteger integer = new BigInteger(1, digest1);
            String passHash = integer.toString(16);
            if(user.getEmail().equals(u.getEmail()) && passHash.equals(u.getPassword())) {
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
            user.setPassword(new BigInteger(1, digest.digest(user.getPassword().getBytes())).toString(16));
            repository.save(user);
            return 0;//successfully
        }
        return 1;//user already exist
    }

    public User getUserInfo(String email){
        User u = repository.findByEmailEquals(email);
        if(u != null)
            u.setPassword(null);
        return u;
    }
}

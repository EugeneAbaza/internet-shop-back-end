package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String email;
    private String password;
    @Column(name = "f_name")
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    private String patronymic;
    private double rating;
    @Column(name = "is_logged")
    private boolean isLogged;
}

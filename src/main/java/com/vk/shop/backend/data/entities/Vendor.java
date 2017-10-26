package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
@Data
public class Vendor {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}

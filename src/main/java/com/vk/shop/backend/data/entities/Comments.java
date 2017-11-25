package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "comments")
@Data
public class Comments {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "id_goods")
    private long goodsId;
    private String comment;
    private String name;
    private Date date;
}

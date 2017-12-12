package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_list")
@Data
public class OrderList {
    @Id
    @GeneratedValue
    private long id;
//    @ManyToOne
//    @JoinColumn(name = "order_id")
    @Column(name ="order_id")
    private long order;
    @OneToOne
    @JoinColumn(name = "goods_id_order_list")
    private Goods goods;
    private int count;
}

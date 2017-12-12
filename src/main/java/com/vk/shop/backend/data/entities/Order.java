package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "payment_type")
    private String paymentType;
    private boolean paid;
    @Column(name = "delivery_city")
    private String deliveredCity;
    @Column(name = "post_office_number")
    private int postOfficeNumber;
    private Date date;
    private long summa;
    @OneToMany(mappedBy = "order")
    private Set<OrderList> goodsList;
}

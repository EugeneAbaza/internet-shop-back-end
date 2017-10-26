package com.vk.shop.backend.data.entities;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "goods")
@Data
public class Goods {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private long price;
    private long quantity;
    @Column(name = "reserved_count")
    private long reservedCount;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;
    private long discount;
    private String image;
    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "date_of_delivery")
    private Date date;
    private int sales;
}

package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cpu")
@Data
public class Cpu {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String model;
    @Column(name = "frequency_min")
    private double frequencyMin;
    @Column(name = "frequency_max")
    private double frequencyMax;
    @Column(name = "count_of_cores")
    private double countOfCores;
    private String vendor;
    @OneToOne
    @JoinColumn(name = "goods_id_cpu")
    private Goods goods;
}

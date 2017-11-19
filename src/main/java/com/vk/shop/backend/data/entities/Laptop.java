package com.vk.shop.backend.data.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
@Data
public class Laptop {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "goods_id")
    private Goods goods;
    private double screen;
    @Column(name = "screen_type")
    private String screenType;
    private String resolution;
    @Column(name = "multi_touch")
    private boolean multiTouch;
    private String color;
    @Column(name = "RAM")
    private int ram;
    @Column(name = "HDD")
    private int hdd;
    @Column(name = "SSD")
    private int ssd;
    private String os;
    @Column(name = "wi_fi")
    private boolean wifi;
    private String bluetooth;
    @Column(name = "webcam")
    private boolean webCam;
    private double weight;
    @Column(name = "cpu_name")
    private String cpuName;
    @Column(name = "cpu_model")
    private String cpuModel;
    @Column(name = "cpu_freq_min")
    private double cpuFrequencyMin;
    @Column(name = "cpu_freq_max")
    private double cpuFrequencyMax;
    @Column(name = "cpu_count_of_cores")
    private int cpuCountOfCores;
    @Column(name = "discrete_graphics")
    private boolean discreteGraphics;
    @Column(name = "gpu_name")
    private String gpuName;
    @Column(name = "gpu_model")
    private String gpuModel;
    @Column(name = "gpu_ram")
    private int gpuRam;
    private boolean lan;
}

package com.example.jpaSolo.entity;

import com.example.jpaSolo.entity.entityService.Service;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Device extends BaseTimeEntity{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "device_no")
    private int id;

    @Column(length = 50,nullable = false)
    private String device_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_no")
    private Service service;

}

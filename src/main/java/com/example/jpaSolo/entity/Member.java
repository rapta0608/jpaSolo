package com.example.jpaSolo.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity @Getter
public class Member {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Id
    @Column(name = "member_no")
    private int id;
    @Column(length = 20 ,nullable = false)
    private String member_name;



}

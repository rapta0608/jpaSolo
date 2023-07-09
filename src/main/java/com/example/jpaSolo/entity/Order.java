package com.example.jpaSolo.entity;


import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_no")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no" ,foreignKey = @ForeignKey(name = "test"))
    private Member members;

    @ColumnDefault("0")
    @Column(length = 10)
    private int order_amount;
    @ColumnDefault("0")
    @Column(length = 10)
    private int pay_amount;
    @ColumnDefault("0")
    @Column(length = 10)
    private int coupon_amount;
    @ColumnDefault("0")
    @Column(length = 10)
    private int coupon_use_no;





}

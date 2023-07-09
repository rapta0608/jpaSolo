package com.example.jpaSolo.entity;

import com.example.jpaSolo.entity.entityService.Item;
import com.example.jpaSolo.entity.entityService.Poster;
import com.example.jpaSolo.entity.entityService.Service;
import com.example.jpaSolo.entity.entityService.Template;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
public class OrderItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_item_no")
    private int id;

    @ColumnDefault("0")
    @Column(length = 10)
    private int card_price;
    @ColumnDefault("0")
    @Column(length = 10)
    private int template_price;
    @ColumnDefault("0")
    @Column(length = 10)
    private int item_price;
    @ColumnDefault("0")
    @Column(length = 10)
    private int poster_price;
    @ColumnDefault("0")
    @Column(length = 10)
    private int quantity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_no")
    private Service service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_no")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_no")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "poster_np")
    private Poster poster;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_no")
    private Template template;

}

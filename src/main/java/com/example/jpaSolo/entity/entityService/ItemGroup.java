package com.example.jpaSolo.entity.entityService;

import com.example.jpaSolo.entity.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
public class ItemGroup extends BaseTimeEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_grp_no")
    private int id;
    @Column(length = 30,nullable = false)
    private String itemGrpName;

    @OneToMany(mappedBy = "itemGroup")
    private List<Item> items=new ArrayList<>();


}

package com.example.jpaSolo.entity.entityService;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_no")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_grp_no")
    private ItemGroup itemGroup;
    private String item_name;

    private int file_no;

    public void changeItemGroup(ItemGroup itemGroup){
        if(this.itemGroup!=null){
            this.itemGroup.getItems().remove(this);
        }
        this.itemGroup=itemGroup;
        itemGroup.getItems().add(this);
    }


}

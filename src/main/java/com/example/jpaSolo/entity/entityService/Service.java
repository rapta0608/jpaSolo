package com.example.jpaSolo.entity.entityService;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public abstract class Service {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "service_no")
    private int id;
    private String service_name;
    private String term_privacy;
    private String term_payment;
    private int card_price;
    private int card_day;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_grp_no" , foreignKey = @ForeignKey(name = "fk_intro_01"))
    private ItemGroup itemGroup;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_grp_no",foreignKey = @ForeignKey(name = "fk_intro_02"))
    private TemplateGroup templateGroup;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poster_grp_no" , foreignKey = @ForeignKey(name = "fk_intro_03"))
    private PosterGroup posterGroup;
}

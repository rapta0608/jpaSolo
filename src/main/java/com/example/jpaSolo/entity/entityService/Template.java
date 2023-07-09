package com.example.jpaSolo.entity.entityService;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Template {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "template_no")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_grp_no")

    private TemplateGroup templateGroup;
    private String template_name;

    private int file_no;



}

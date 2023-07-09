package com.example.jpaSolo.entity.entityService;

import com.example.jpaSolo.entity.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
public class TemplateGroup extends BaseTimeEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "template_grp_no")
    private int id;
    @Column(length = 30,nullable = false)
    private String templateGrpName;

    @OneToMany(mappedBy = "templateGroup" )
    private List<Template> templates=new ArrayList<>();
}

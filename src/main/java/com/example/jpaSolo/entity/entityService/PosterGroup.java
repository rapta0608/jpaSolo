package com.example.jpaSolo.entity.entityService;

import com.example.jpaSolo.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PosterGroup extends BaseTimeEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "poster_grp_no")
    private int id;
    @Column(length = 30,nullable = false)
    private String postGrpName;

    @OneToMany(mappedBy = "posterGroup" )
    private List<Poster> posters=new ArrayList<>();


    public PosterGroup(String postGrpName) {
        this.postGrpName = postGrpName;
    }
}

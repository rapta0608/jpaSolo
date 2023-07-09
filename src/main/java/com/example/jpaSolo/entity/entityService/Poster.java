package com.example.jpaSolo.entity.entityService;

import com.example.jpaSolo.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Poster extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "poster_no")
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poster_grp_no")
    private PosterGroup posterGroup;
    private String poster_name;
    private int file_no;

    public Poster(String poster_name,int file_no) {
        this.poster_name = poster_name;
        this.file_no=file_no;
    }

    public void changePosterGrp(PosterGroup posterGroup){
        if(this.posterGroup!=null){
            posterGroup.getPosters().remove(this);
        }
        this.posterGroup=posterGroup;
        posterGroup.getPosters().add(this);

    }


}

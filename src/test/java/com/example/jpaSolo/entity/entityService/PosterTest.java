package com.example.jpaSolo.entity.entityService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Commit
class PosterTest {

    @Autowired
    EntityManager em;


    @Test
    void insertPoster(){
        PosterGroup posterGroup=new PosterGroup("test");
        em.persist(posterGroup);

        int id = posterGroup.getId();
        System.out.println(id);
        em.flush();
        em.clear();




        PosterGroup posterGroup1 = em.find(PosterGroup.class, posterGroup.getId());
        Poster poster = new Poster("포스터1", 10);
        poster.changePosterGrp(posterGroup1);
        em.persist(poster);
    }
}
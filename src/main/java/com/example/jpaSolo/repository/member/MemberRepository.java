package com.example.jpaSolo.repository.member;

import com.example.jpaSolo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}

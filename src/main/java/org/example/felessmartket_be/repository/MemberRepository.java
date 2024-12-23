package org.example.felessmartket_be.repository;

import java.util.List;
import org.example.felessmartket_be.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    List<Member> findAll();
}

package org.example.felessmartket_be.repository;

import java.util.List;
import org.example.felessmartket_be.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();
}

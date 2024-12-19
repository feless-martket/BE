package org.example.felessmartket_be;


import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.example.felessmartket_be.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class InitDB {
    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.productInit();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{

        private final EntityManager em;


        @RequiredArgsConstructor
        public enum Genre {

        }

        public void productInit() {
            LocalDateTime today = LocalDateTime.now();
            today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss"));

            /*LocalDateTime releaseDate = today.minusDays(6);
            LocalDate startDate = LocalDate.now().plusDays(1);
            LocalDate endDate = LocalDate.now().plusDays(10);
*/


            for(int i = 0; i < 5; i++) {
                User user = userCreate("a" + i, "1" + i, "1" + i);
                em.persist(user);
            }

        }

        public static User userCreate(String name, String password, String phoneNumber) {
            return new User(name, password, phoneNumber);
        }
    }
}
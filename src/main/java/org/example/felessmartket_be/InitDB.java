package org.example.felessmartket_be;


import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.example.felessmartket_be.domain.Cart;
import org.example.felessmartket_be.domain.Member;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
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


            for(int i = 1; i <= 20; i++) {
                Member member = userCreate("a" + i, "1" + i, "1" + i);
                Cart cart = cartCreate(member, i, i);
                em.persist(member);
                em.persist(cart);
            }
        }

        public static Member userCreate(String name, String password, String phoneNumber) {
            return new Member(name, password, phoneNumber);
        }

        public static Cart cartCreate(Member member, Integer quantity, Integer price) {
            return new Cart(member, quantity, price);
        }
    }
}
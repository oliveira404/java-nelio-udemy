package com.meusestudos.course.config;

import com.meusestudos.course.entities.Category;
import com.meusestudos.course.entities.Order;
import com.meusestudos.course.entities.User;
import com.meusestudos.course.entities.enums.OrderStatus;
import com.meusestudos.course.repositories.CategoryRepository;
import com.meusestudos.course.repositories.OrderRepository;
import com.meusestudos.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // tudo que tiver dentro deste méttodo será executado quando a aplicação for iniciada.

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User user1 = new User("maria", "asas@gmail.com", "40028922", "1234");
        User user2 = new User("carlos", "carlos@gmail.com", "40028922", "1234");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2, OrderStatus.PAID);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), user1, OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}

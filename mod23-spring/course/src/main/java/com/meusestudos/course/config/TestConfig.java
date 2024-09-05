package com.meusestudos.course.config;

import com.meusestudos.course.entities.User;
import com.meusestudos.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "maria", "asas@gmail.com", "40028922", "1234");
        User user2 = new User(null, "carlos", "carlos@gmail.com", "40028922", "1234");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
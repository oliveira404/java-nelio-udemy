package com.meusestudos.springmongo.services;

import com.meusestudos.springmongo.domain.User;
import com.meusestudos.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (!user.isPresent()) throw new RuntimeException("nao existe um cadastro com esse id" + userId);
        return user.get();
    }
}

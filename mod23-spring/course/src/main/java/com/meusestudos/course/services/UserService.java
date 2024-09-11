package com.meusestudos.course.services;

import com.meusestudos.course.entities.User;
import com.meusestudos.course.repositories.UserRepository;
import com.meusestudos.course.services.exceptions.DatabaseException;
import com.meusestudos.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElseThrow(() -> new ResourceNotFoundException(userId));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long userId) {
        try {
            findById(userId);
            userRepository.deleteById(userId);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long userId, User user) {
        findById(userId);
        // met0d0 mais eficiênte do que usar o getById
        User entity = userRepository.getReferenceById(userId);
        updateData(entity, user);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
package com.meusestudos.springmongo.services;

import com.meusestudos.springmongo.DTO.UserDTO;
import com.meusestudos.springmongo.domain.User;
import com.meusestudos.springmongo.repository.UserRepository;
import com.meusestudos.springmongo.request.UserRequest;
import com.meusestudos.springmongo.services.exceptions.ObjectNotFoundException;
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
        if (!user.isPresent()) throw new ObjectNotFoundException(String.format("Não existe um cadastro de user com id: %s", userId));
        return user.get();
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public void delete(String userId) {
        findById(userId);
        userRepository.deleteById(userId);
    }

    public User update(UserRequest userRequest, String userId) {
        Optional<User> user = userRepository.findById(userId);
        if (!user.isPresent()) throw new ObjectNotFoundException(String.format("Não existe um cadastro de user com id: %s", userId));
        User userConvertido = updateData(user.get(), userRequest);
        return userRepository.save(userConvertido);
    }

    private User updateData(User user, UserRequest userRequest) {
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        return user;
    }

    public User fromDTO(UserRequest userRequest) {
        return new User(userRequest.getName(), userRequest.getEmail());
    }
}

package com.meusestudos.springmongo.resources;

import com.meusestudos.springmongo.domain.User;
import com.meusestudos.springmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(/*@PathVariable Long userId*/) {
        return ResponseEntity.ok(userService.findAll());
    }
}
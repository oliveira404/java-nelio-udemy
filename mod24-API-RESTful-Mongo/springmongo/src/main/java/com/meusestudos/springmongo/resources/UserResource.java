package com.meusestudos.springmongo.resources;

import com.meusestudos.springmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(/*@PathVariable Long userId*/) {
        User maria = new User(null, "maria", "maria@gmail.com");
        User carlos = new User(null, "carlos", "carlos@gmail.com");
        return ResponseEntity.ok(Arrays.asList(maria, carlos));
    }
}

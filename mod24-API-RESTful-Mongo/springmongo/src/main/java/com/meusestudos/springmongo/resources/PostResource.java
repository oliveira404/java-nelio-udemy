package com.meusestudos.springmongo.resources;

import com.meusestudos.springmongo.domain.Post;
import com.meusestudos.springmongo.repository.PostRepository;
import com.meusestudos.springmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public ResponseEntity<List<Post>> findAll() {
        List<Post> userList = postRepository.findAll();
        //List<UserDTO> userDTOList = userList.stream().map(x -> new UserDTO(x)).toList();
        return ResponseEntity.ok(userList);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Post> findById(@PathVariable String postId) {
        Post post = postService.findById(postId);
        return ResponseEntity.ok(post);
    }
}

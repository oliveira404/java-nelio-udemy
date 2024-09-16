package com.meusestudos.springmongo.resources;

import com.meusestudos.springmongo.domain.Post;
import com.meusestudos.springmongo.resources.util.URL;
import com.meusestudos.springmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping("/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitle(text);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Post> findById(@PathVariable String postId) {
        Post post = postService.findById(postId);
        return ResponseEntity.ok(post);
    }
}
package com.meusestudos.springmongo.services;

import com.meusestudos.springmongo.domain.Post;
import com.meusestudos.springmongo.repository.PostRepository;
import com.meusestudos.springmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class PostService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    PostRepository postRepository;

    public Post findById(String postId) {
        Optional<Post> post = postRepository.findById(postId);
        if (!post.isPresent()) throw new ObjectNotFoundException(String.format("Não existe um cadastro de post com id: %s", postId));
        return post.get();
    }

    public List<Post> findByTitle(String text) {
        return postRepository.findByTitleContainingIgnoreCase(text);
    }
}

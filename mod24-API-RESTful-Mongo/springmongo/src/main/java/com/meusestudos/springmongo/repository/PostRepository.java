package com.meusestudos.springmongo.repository;

import com.meusestudos.springmongo.domain.Post;
import com.meusestudos.springmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    default Post findByIdOrThrowException(String userId) {
        return this.findById(userId).orElseThrow(() -> new ObjectNotFoundException(userId));
    }

    List<Post> findByTitleContainingIgnoreCase(String text);


    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> findByTitulo(String text);
}

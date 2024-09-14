package com.meusestudos.springmongo.repository;

import com.meusestudos.springmongo.domain.User;
import com.meusestudos.springmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    default User findByIdOrThrowException(String userId) {
        return this.findById(userId).orElseThrow(() -> new ObjectNotFoundException(userId));
    }
}

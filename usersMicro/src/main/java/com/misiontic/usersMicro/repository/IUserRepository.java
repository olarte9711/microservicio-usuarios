package com.misiontic.usersMicro.repository;

import com.misiontic.usersMicro.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IUserRepository extends MongoRepository<User,Long> {
    User findByIdUser(Long userId);
    Optional<User> findByUsername(String username);
    void deleteByIdUser(Long userId);
}

package com.misiontic.usersMicro.repository;

import com.misiontic.usersMicro.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User,Long> {

}

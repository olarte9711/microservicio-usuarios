package com.misiontic.usersMicro.service;

import com.misiontic.usersMicro.model.User;

import java.util.Optional;

public interface IUserService {
    String createUser(User user);

    Optional<User> getUserById(Long userId);

    Optional<User> getUserByUsername(String username);
}

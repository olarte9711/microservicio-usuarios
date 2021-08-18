package com.misiontic.usersMicro.service;

import com.misiontic.usersMicro.dto.UserUpdateDTO;
import com.misiontic.usersMicro.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    String createUser(User user);

    User getUserById(Long userId);

    Optional<User> getUserByUsername(String username);

    String deleteUser(Long userId);

    String updateUser(Long userId, UserUpdateDTO userUpdateDTO);

    List<User> getAllAdmin();
}

package com.misiontic.usersMicro.service;

import com.misiontic.usersMicro.model.User;
import com.misiontic.usersMicro.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private IUserRepository iUserRepository;

    @Override
    public String createUser(User user) {
        iUserRepository.save(user);
        return "Creado satisfactoriamente";
    }
    @Override
    public Optional<User> getUserById(Long userId) {
        Optional<User> userResult = iUserRepository.findByIdUser(userId);
        return userResult;
    }

   @Override
    public Optional<User> getUserByUsername(String username) {
        Optional<User> user = iUserRepository.findByUsername(username);
        return user;
    }

}

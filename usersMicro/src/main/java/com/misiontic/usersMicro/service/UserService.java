package com.misiontic.usersMicro.service;

import com.misiontic.usersMicro.dto.UserUpdateDTO;
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
    public User getUserById(Long userId) {
        User userResult = iUserRepository.findByIdUser(userId);
        return userResult;
    }

   @Override
    public Optional<User> getUserByUsername(String username) {
        Optional<User> user = iUserRepository.findByUsername(username);
        return user;
    }

    @Override
    public String deleteUser(Long userId) {
        iUserRepository.deleteByIdUser(userId);
        return "Borrado";
    }

    @Override
    public String updateUser(Long userId, UserUpdateDTO userUpdateDTO) {
        User user = iUserRepository.findByIdUser(userId);
        user.setFullname(userUpdateDTO.getFullname());
        user.setUsername(userUpdateDTO.getUsername());
        user.setPassword(userUpdateDTO.getPassword());
        user.setIsAdmin(userUpdateDTO.getIsAdmin());
        iUserRepository.save(user);
        return "Actualizado";
    }

}

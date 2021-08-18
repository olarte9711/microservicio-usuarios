package com.misiontic.usersMicro.service;

import com.misiontic.usersMicro.model.User;
import com.misiontic.usersMicro.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private IUserRepository iUserRepository;

    @Override
    public String createUser(User user) {
        iUserRepository.save(user);
        return "Creado satisfactoriamente";
    }
}

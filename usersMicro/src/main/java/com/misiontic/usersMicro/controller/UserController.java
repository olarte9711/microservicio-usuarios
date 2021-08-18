package com.misiontic.usersMicro.controller;

import com.misiontic.usersMicro.model.User;
import com.misiontic.usersMicro.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private IUserService iUserService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        return new ResponseEntity<>(iUserService.createUser(user), HttpStatus.CREATED);
    }


}

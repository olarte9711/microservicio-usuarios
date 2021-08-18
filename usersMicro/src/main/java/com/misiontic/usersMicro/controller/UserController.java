package com.misiontic.usersMicro.controller;

import com.misiontic.usersMicro.model.User;
import com.misiontic.usersMicro.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private IUserService iUserService;

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        return new ResponseEntity<>(iUserService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/get-by-id/{userId}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable Long userId) {
        return new ResponseEntity<>(iUserService.getUserById(userId), HttpStatus.OK);
    }
   @GetMapping("get-by-username/{username}")
    public ResponseEntity<Optional<User>> getUserByUsername(@PathVariable String username) {
        return new ResponseEntity<>(iUserService.getUserByUsername(username), HttpStatus.OK);
    }

}

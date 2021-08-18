package com.misiontic.usersMicro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDTO {
    private String fullname;
    private String username;
    private String password;
    private Boolean isAdmin;
}

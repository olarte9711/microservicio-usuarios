package com.misiontic.usersMicro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long idUser;
    private String fullname;
    private String username;
    private String password;
    private Boolean isAdmin;

}

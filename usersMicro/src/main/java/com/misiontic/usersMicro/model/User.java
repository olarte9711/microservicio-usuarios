package com.misiontic.usersMicro.model;

import lombok.Data;


@Data
public class User {
    private Long idUser;
    private String fullname;
    private String username;
    private String password;
    private Boolean isAdmin;

}

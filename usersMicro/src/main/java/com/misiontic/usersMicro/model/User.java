package com.misiontic.usersMicro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Long idUser;
    private String fullname;
    private String username;
    private String password;
    private Boolean isAdmin;

}

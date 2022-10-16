package com.jooijin.myJewerly.springboot.config.auth.dto;

import com.jooijin.myJewerly.springboot.domain.user.Users;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(Users users) {
        this.name = users.getName();
        this.email = users.getEmail();
        this.picture = users.getPicture();
    }

}

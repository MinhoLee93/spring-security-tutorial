package com.tutorial.security.jwt;

import lombok.Getter;
import lombok.Setter;

/**
 * login request json body
 * */
@Getter
@Setter
public class LoginViewModel {
    private String username;
    private String password;
}

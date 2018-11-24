package com.markey.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import java.util.UUID;

@RestController
@PermitAll
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User getUser() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("makai");
        user.setPassword("12345679890");
        return user;
    }
}

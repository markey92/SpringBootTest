package com.markey.annotations.Vaild;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;

@RestController
@PermitAll
@RequestMapping("/vaild")
public class VaildController {

    @PostMapping
    public VaildUser postUser(@Valid @RequestBody VaildUser user) {
        return user;
    }
}

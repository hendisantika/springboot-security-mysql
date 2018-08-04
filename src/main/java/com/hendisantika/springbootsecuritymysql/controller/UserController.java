package com.hendisantika.springbootsecuritymysql.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/08/18
 * Time: 05.59
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/user")
    public String helloUser() {
        return "Welcome to Springboot Security tutorial";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
    public String securedUser() {
        return "Welcome admin to this tutorial ";

    }
}

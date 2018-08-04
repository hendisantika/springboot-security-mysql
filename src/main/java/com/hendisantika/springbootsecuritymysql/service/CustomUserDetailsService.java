package com.hendisantika.springbootsecuritymysql.service;

import com.hendisantika.springbootsecuritymysql.entity.CustomUserDetails;
import com.hendisantika.springbootsecuritymysql.entity.Users;
import com.hendisantika.springbootsecuritymysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/08/18
 * Time: 05.56
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> users = userRepository.findByUsername(username);
        users.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return users.map(CustomUserDetails::new).get();
    }
}
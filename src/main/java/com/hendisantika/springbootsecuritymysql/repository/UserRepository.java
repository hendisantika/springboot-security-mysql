package com.hendisantika.springbootsecuritymysql.repository;

import com.hendisantika.springbootsecuritymysql.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/08/18
 * Time: 05.54
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByUsername(String username);
}
package com.ishitwa.url_shortner.repository;

import com.ishitwa.url_shortner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

    public User findUserByUsername(String username);
    public User findUserByEmail(String username);

}

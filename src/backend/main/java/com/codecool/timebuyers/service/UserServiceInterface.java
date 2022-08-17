package com.codecool.timebuyers.service;

import com.codecool.timebuyers.model.UserProfile;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserServiceInterface extends UserDetailsService {

    UserProfile save(UserProfile user);

    boolean usernameExists(String username);
}

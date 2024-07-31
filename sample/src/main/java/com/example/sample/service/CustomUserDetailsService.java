package com.example.sample.service;

import com.example.sample.model.Users;
import com.example.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("Authenticating user: {}", username);
        Users user = userRepository.findByUsername(username);
        if (user != null) {
            logger.debug("User found: {}", username);
            return User.withUsername(user.getUsername())
                       .password(user.getPassword())
                       .roles("USER")
                       .build();
        } else {
            logger.error("User not found: {}", username);
            throw new UsernameNotFoundException("User not found");
        }
    }
}

package com.example.sample.controller;

import com.example.sample.model.Users;
import com.example.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String listUsers(Model model) {
        logger.debug("users");
        model.addAttribute("users", userService.findAllUsers());
        return "users";
    }

    @GetMapping("/register")
    public String register() {
        logger.debug("register");
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        logger.debug("registerUser");
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(password);
        userService.saveUser(user);
        return "redirect:/users";
    }
}

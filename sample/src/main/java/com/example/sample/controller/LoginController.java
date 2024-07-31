package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping({"/", "/login"})
    public String login() {
        logger.debug("login");
        return "login";
    }
}

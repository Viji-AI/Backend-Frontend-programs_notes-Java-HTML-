package com.example.validation.Controller;

import com.example.validation.Exception.InvalidAgeException;
import com.example.validation.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {

        if (user.getAge() < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        return "User created successfully";
    }
}
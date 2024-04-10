package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String register(@RequestBody User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "Email already exists";
        }

//        if (!user.getPassword().equals(user.getConfirmPassword())) {
//            return "Passwords do not match";
//        }

        // Save user to database
        userRepository.save(user);
        return "Registration successful";
    }
  
    @GetMapping("/users")
    public List<User> getAllYourEntities() {
        return userRepository.findAll();
    }
    @GetMapping("/login")
    public String login(@RequestBody User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
            return "Invalid email or password";
        }
        return "Login successful";
    }
}

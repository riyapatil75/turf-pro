package com.example.TurfPro.controllers;
import com.example.TurfPro.entity.User;
import com.example.TurfPro.repository.UserRepository;
import com.example.TurfPro.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.registerUser(user);
    }


    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userService.loginUser(user.getEmail(), user.getPassword());
    }


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }


    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}

package com.example.TurfPro.services;

import com.example.TurfPro.entity.User;
import com.example.TurfPro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;

        public User registerUser(User user){
            return userRepository.save(user);
        }

        public User loginUser(String email, String password){

            User user = userRepository.findByEmail(email);

            if(user != null && user.getPassword().equals(password)){
                return user;
            }

            throw new RuntimeException("Invalid Email or Password");
        }

        public List<User> getAllUsers(){
            return userRepository.findAll();
        }

        public User getUserById(Long id){
            return userRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("User not found"));
        }

        public User updateUser(Long id, User updatedUser){

            User user = getUserById(id);

            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPhone(updatedUser.getPhone());

            return userRepository.save(user);
        }

        public void deleteUser(Long id){
            userRepository.deleteById(id);
        }

    }
package com.codeclan.example.phileas_blogg_back_end.controllers;

import com.codeclan.example.phileas_blogg_back_end.models.User;
import com.codeclan.example.phileas_blogg_back_end.repositories.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value="/profile/{username}")
    public User getByUsername(@PathVariable String username){
        return userRepository.findByUsernameIgnoreCase(username);
    }

    @GetMapping(value="/level/{level}")
    public List<User> getUsersByLevel(@PathVariable int level){
        return userRepository.findByLevel(level);
    }

    @GetMapping(value="/ranking")
    public List<User> getUsersByLevelDesc(){
        return userRepository.findAllByOrderByLevelDesc();
    }

    @GetMapping(value="/contains/{partial_username}")
    public List<User> getUsersByPartialUsername(@PathVariable String partial_username){
        return userRepository.findByUsernameContainingIgnoreCase(partial_username);
    }
}

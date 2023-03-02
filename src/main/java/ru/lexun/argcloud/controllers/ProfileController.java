package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/app/profile")
public class ProfileController {
    private final UserRepository userRepository;
    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}

package ru.lexun.argcloud.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lexun.argcloud.config.Mapper;
import ru.lexun.argcloud.dto.UserDTO;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.UserRepository;
import ru.lexun.argcloud.services.UserService;

@RestController
@RequestMapping("/registration")
public class RegisterController {
    private final UserService userService;
    private final Mapper mapper;
    @Autowired
    public RegisterController(UserService userService,Mapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO){
        userService.save(mapper.toUser(userDTO));
    }
}

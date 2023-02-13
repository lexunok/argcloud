package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lexun.argcloud.config.Mapper;
import ru.lexun.argcloud.dto.UserDTO;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    private final UserService userService;
    private final Mapper mapper;
    @Autowired
    public ProfileController(UserService userService,Mapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }
    @GetMapping("/all")
    public List<UserDTO> showUsers(){
        return userService.findAll().stream().map(this.mapper::toUserDTO).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public UserDTO showUser(@PathVariable Long id){
        return mapper.toUserDTO(userService.findById(id));
    }
}

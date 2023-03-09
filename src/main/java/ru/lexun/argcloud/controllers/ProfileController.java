package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.lexun.argcloud.config.Mapper;
import ru.lexun.argcloud.dto.ProfileDTO;
import ru.lexun.argcloud.dto.UserDTO;
import ru.lexun.argcloud.services.ProfileService;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    private final ProfileService profileService;
    private final Mapper mapper;
    @Autowired
    public ProfileController(ProfileService profileService, Mapper mapper) {
        this.profileService = profileService;
        this.mapper = mapper;
    }
    @GetMapping
    public ProfileDTO getUser(@RequestParam(name = "username") String username){
        return mapper.toProfileDTO(
                        profileService.getUser(username));
    }
}

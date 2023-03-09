package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.lexun.argcloud.config.Mapper;
import ru.lexun.argcloud.dto.FriendDTO;
import ru.lexun.argcloud.dto.ProfileDTO;
import ru.lexun.argcloud.dto.UserDTO;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.services.ProfileService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/friends")
public class FriendsController {

    private final ProfileService profileService;
    private final Mapper mapper;
    @Autowired
    public FriendsController(ProfileService profileService, Mapper mapper) {
        this.profileService = profileService;
        this.mapper = mapper;
    }

    @PostMapping
    public void addFriend(@RequestBody FriendDTO friendDTO){
        User user = profileService.getUser(friendDTO.getUser());
        User friend = profileService.getUser(friendDTO.getFriend());
        user.getFriends().add(friend);
        friend.getFriends().add(user);
        profileService.save(user);
        profileService.save(friend);
    }
    @GetMapping
    public List<ProfileDTO> getFriends(@RequestParam(name = "username") String username){
        List<User> friends = profileService.getUser(username).getFriends();
        return friends.stream().map(this.mapper::toProfileDTO).collect(Collectors.toList());
    }

}

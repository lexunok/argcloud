package ru.lexun.argcloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.UserRepository;

@Service
public class ProfileService {
    private final UserRepository userRepository;
    @Autowired
    public ProfileService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getUser(String username){
        return userRepository.findByUsername(username).get();
    }
}

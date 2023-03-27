package ru.lexun.argcloud.services;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.UserRepository;

import java.util.NoSuchElementException;

@Service
public class ProfileService {
    private final UserRepository userRepository;
    @Autowired
    public ProfileService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getUser(String username){
        return userRepository.findByUsername(username).orElseThrow();
    }
    public void save(User user){userRepository.save(user);}
}

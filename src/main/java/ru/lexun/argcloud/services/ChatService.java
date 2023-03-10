package ru.lexun.argcloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lexun.argcloud.models.Chat;
import ru.lexun.argcloud.repositories.ChatRepository;

import java.util.List;

@Service
public class ChatService {
    private final ChatRepository chatRepository;
    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }
    public void save(Chat chat){
        chatRepository.save(chat);
    }
    public Chat findChat(Long id){
        return chatRepository.findById(id).get();
    }
    public void delete(Long id){
        Chat chat = chatRepository.findById(id).get();
        chatRepository.delete(chat);
    }
}

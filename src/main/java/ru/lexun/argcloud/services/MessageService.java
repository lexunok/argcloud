package ru.lexun.argcloud.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lexun.argcloud.models.Message;
import ru.lexun.argcloud.repositories.MessageRepository;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;
    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    @Transactional
    public void save(Message message){
        messageRepository.save(message);
    }
    public List<Message> getMessages(){
        return messageRepository.findAll();
    }
}

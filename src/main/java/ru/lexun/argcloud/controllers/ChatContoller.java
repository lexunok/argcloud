package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.lexun.argcloud.models.Message;
import ru.lexun.argcloud.repositories.MessageRepository;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatContoller {
    private final MessageRepository messageRepository;
    @Autowired
    public ChatContoller(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public List<Message> getMessage(){
        return messageRepository.findAll();
    }
    @PostMapping
    public void postMessage(@RequestBody Message message){
        messageRepository.save(message);
    }
}

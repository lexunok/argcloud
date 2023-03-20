package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.lexun.argcloud.models.Chat;
import ru.lexun.argcloud.models.Message;
import ru.lexun.argcloud.services.ChatService;

import java.util.List;

@RestController
@RequestMapping("api/chat")
public class ChatContoller {
    private final ChatService chatService;
    @Autowired
    public ChatContoller(ChatService chatService) {
        this.chatService = chatService;
    }
    @GetMapping
    public List<Message> findChat(@RequestParam(name = "id") Long id){
        return chatService.findChat(id).getMessages();
    }
    @PostMapping
    public Message sendMessageToLocal(@RequestParam(name = "id") Long id, @RequestBody Message message){
        Chat chat = chatService.findChat(id);
        chat.getMessages().add(message);
        chatService.save(chat);
        return message;
    }

}

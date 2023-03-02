package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.lexun.argcloud.config.Mapper;
import ru.lexun.argcloud.dto.MessageDTO;
import ru.lexun.argcloud.models.Message;
import ru.lexun.argcloud.services.MessageService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/chat")
public class ChatContoller {
    private final MessageService messageService;
    private final Mapper mapper;
    @Autowired
    public ChatContoller(MessageService messageService,Mapper mapper) {
        this.messageService = messageService;
        this.mapper = mapper;
    }


    @GetMapping
    public List<MessageDTO> getMessages(){
        return messageService.getMessages().stream().map(this.mapper::toMessageDTO).collect(Collectors.toList());
    }
    @PostMapping
    public void postMessage(@RequestBody MessageDTO messageDTO){
        messageService.save(mapper.toMessage(messageDTO));
    }
}

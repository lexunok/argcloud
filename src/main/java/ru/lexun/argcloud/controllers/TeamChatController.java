package ru.lexun.argcloud.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import ru.lexun.argcloud.models.Message;

@Controller
public class TeamChatController {
    @MessageMapping("/team.chat.sendMessage")
    @SendTo("/topic/teamchat/")
    public Message sendTeamMessage(@RequestBody Message message){
        return message;
    }

}

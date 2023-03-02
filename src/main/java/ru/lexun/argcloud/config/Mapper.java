package ru.lexun.argcloud.config;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.lexun.argcloud.dto.MessageDTO;
import ru.lexun.argcloud.dto.UserDTO;
import ru.lexun.argcloud.models.Message;
import ru.lexun.argcloud.models.User;
@Component
public class Mapper {
    public Message toMessage(MessageDTO messageDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(messageDTO, Message.class);
    }
    public MessageDTO toMessageDTO(Message message){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(message, MessageDTO.class);
    }
    public UserDTO toUserDTO(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDTO.class);
    }
}

package ru.lexun.argcloud.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Chat {
    public Chat(Long idFirst,Long idSecond){
        this.id = idFirst*idSecond;
    }
    @Id
    private Long id;
    @OneToMany(cascade= CascadeType.ALL)
    private List<Message> messages;
}

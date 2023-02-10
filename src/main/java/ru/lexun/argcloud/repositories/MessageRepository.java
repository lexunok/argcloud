package ru.lexun.argcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lexun.argcloud.models.Message;

public interface MessageRepository extends JpaRepository<Message,Long> {
}

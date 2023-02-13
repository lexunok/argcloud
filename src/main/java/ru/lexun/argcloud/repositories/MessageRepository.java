package ru.lexun.argcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lexun.argcloud.models.Message;
@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}

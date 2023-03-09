package ru.lexun.argcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lexun.argcloud.models.Chat;
@Repository
public interface ChatRepository extends JpaRepository<Chat,Long> {
}

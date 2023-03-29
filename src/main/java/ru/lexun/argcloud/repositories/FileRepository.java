package ru.lexun.argcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lexun.argcloud.models.FileDB;
@Repository
public interface FileRepository extends JpaRepository<FileDB,Long> {
}

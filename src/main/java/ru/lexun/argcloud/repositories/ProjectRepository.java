package ru.lexun.argcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lexun.argcloud.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}

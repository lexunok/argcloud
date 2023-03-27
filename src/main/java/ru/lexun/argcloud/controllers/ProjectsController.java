package ru.lexun.argcloud.controllers;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.lexun.argcloud.config.Mapper;
import ru.lexun.argcloud.dto.ProfileDTO;
import ru.lexun.argcloud.dto.ProjectDTO;
import ru.lexun.argcloud.models.Project;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.ProjectRepository;
import ru.lexun.argcloud.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {
    private final ProjectRepository repository;
    private final UserRepository userRepository;
    private final Mapper mapper;
    @Autowired
    public ProjectsController(ProjectRepository repository, UserRepository userRepository, Mapper mapper) {
        this.repository = repository;
        this.userRepository = userRepository;
        this.mapper = mapper;
    }
    @GetMapping("/users/{id}")
    public List<ProfileDTO> getAllUsers(@PathVariable Long id){
        Project project = repository.findById(id).get();
        return project.getUsers().stream().map(mapper::toProfileDTO).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public List<ProjectDTO> getAllProjects(@PathVariable Long id){
        User user = userRepository.findById(id).get();
        return user.getProjects().stream().map(mapper::toProjectDTO).collect(Collectors.toList());
    }
    @GetMapping("/project/{id}")
    public ProjectDTO getProject(@PathVariable Long id){
        return mapper.toProjectDTO(repository.findById(id).get());
    }
    @PostMapping("/{id}")
    @Transactional
    public ProjectDTO createProject(@PathVariable Long id,@RequestBody ProjectDTO projectDTO){
        User user = userRepository.findById(id).get();
        Project project = mapper.toProject(projectDTO);
        project.setUsers(List.of(user));
        user.getProjects().add(project);
        repository.save(project);
        userRepository.save(user);
        return mapper.toProjectDTO(project) ;
    }
    @PostMapping("/project/{id}")
    @Transactional
    public ProjectDTO joinProject(@PathVariable Long id,  @RequestParam(name = "id") Long userId){
        User user = userRepository.findById(userId).get();
        Project project = repository.findById(id).get();
        project.getUsers().add(user);
        user.getProjects().add(project);
        repository.save(project);
        userRepository.save(user);
        return mapper.toProjectDTO(project);
    }
}

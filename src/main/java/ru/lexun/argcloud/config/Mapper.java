package ru.lexun.argcloud.config;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.lexun.argcloud.dto.ProfileDTO;
import ru.lexun.argcloud.dto.ProjectDTO;
import ru.lexun.argcloud.dto.UserDTO;
import ru.lexun.argcloud.models.Message;
import ru.lexun.argcloud.models.Project;
import ru.lexun.argcloud.models.User;
@Component
public class Mapper {
    public UserDTO toUserDTO(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDTO.class);
    }
    public ProfileDTO toProfileDTO(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, ProfileDTO.class);
    }
    public ProjectDTO toProjectDTO(Project project){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(project, ProjectDTO.class);
    }
    public Project toProject(ProjectDTO project){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(project, Project.class);
    }
}

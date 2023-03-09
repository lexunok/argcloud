package ru.lexun.argcloud.dto;

import lombok.Data;

@Data
public class ProfileDTO {
    private Long id;
    private String fullname;
    private String email;
    private String username;
}

package ru.lexun.argcloud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class FileDTO {
    private String name;
    private String url;
    private String type;
    private Long size;
}

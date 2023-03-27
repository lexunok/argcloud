package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.lexun.argcloud.services.FilesService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {
    private final FilesService filesService;
    @Value("${files.path}")
    private String path;
    @Autowired
    public FileController(FilesService filesService) {
        this.filesService = filesService;
    }

    @PostMapping("/upload")
    public ResponseEntity<List<String>> uploadFile(@RequestPart MultipartFile[] files) throws IOException {
        List<String> fileNames = new ArrayList<>();
        Arrays.stream(files).forEach(file -> {
            try {
                String name = filesService.uploadFile(path,file);
                fileNames.add(name);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        return new ResponseEntity<>(fileNames,HttpStatus.OK);
    }
}

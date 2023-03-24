package ru.lexun.argcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.lexun.argcloud.services.FilesService;

import java.io.IOException;

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
    public ResponseEntity<String> uploadFile(@RequestPart MultipartFile file) throws IOException {
        String fileName = filesService.uploadFile(path,file);
        return new ResponseEntity<>(fileName + " successfully uploaded",HttpStatus.OK);
    }
}

package ru.lexun.argcloud.controllers;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.lexun.argcloud.dto.FileDTO;
import ru.lexun.argcloud.models.FileDB;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.UserRepository;
import ru.lexun.argcloud.services.StorageService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/files")
public class FileController {
    private final StorageService storage;
    private final UserRepository userRepository;
    @Autowired
    public FileController(StorageService storage, UserRepository userRepository) {
        this.storage = storage;
        this.userRepository = userRepository;
    }

    @PostMapping("/upload/{id}")
    @Transactional
    public ResponseEntity<List<FileDTO>> uploadFile(@RequestPart MultipartFile[] files,@PathVariable Long id) throws IOException {
        List<FileDTO> filesDTO = new ArrayList<>();
        User user = userRepository.findById(id).get();
        Arrays.stream(files).forEach(file -> {
            try {
                FileDB fileDB = storage.store(file,user);
                user.getFiles().add(fileDB);
                String url = ServletUriComponentsBuilder
                        .fromCurrentContextPath()
                        .path("/api/files/")
                        .path(fileDB.getId().toString())
                        .path(fileDB.getId().toString())
                        .toUriString();
                FileDTO fileDTO = new FileDTO(
                        fileDB.getName(),
                        url,
                        fileDB.getType(),
                        (long) fileDB.getData().length
                );
                filesDTO.add(fileDTO);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        return new ResponseEntity<>(filesDTO,HttpStatus.OK);
    }
    @GetMapping("/all/{id}")
    @Transactional
    public ResponseEntity<List<FileDTO>> getListFiles(@PathVariable Long id) {
        User user = userRepository.findById(id).get();
        List<FileDTO> files = user.getFiles().stream().map(file -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/api/files/")
                    .path(file.getId().toString())
                    .toUriString();
            return new FileDTO(
                    file.getName(),
                    fileDownloadUri,
                    file.getType(),
                    (long) file.getData().length);
        }).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(files);
    }
    @GetMapping("/download/{id}")
    @Transactional
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        FileDB fileDB = storage.getFile(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
                .body(fileDB.getData());
    }
}

package ru.lexun.argcloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import ru.lexun.argcloud.models.FileDB;
import ru.lexun.argcloud.models.User;
import ru.lexun.argcloud.repositories.FileRepository;

import java.io.*;
import java.util.stream.Stream;

@Service
public class StorageService {

    private final FileRepository fileDBRepository;
    @Autowired
    public StorageService(FileRepository fileDBRepository) {
        this.fileDBRepository = fileDBRepository;
    }

    public FileDB store(MultipartFile file, User user) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB fileDB = new FileDB(fileName,file.getContentType(),file.getBytes());
        fileDB.setUser(user);
        return fileDBRepository.save(fileDB);
    }

    public FileDB getFile(Long id) {
        return fileDBRepository.findById(id).get();
    }

}


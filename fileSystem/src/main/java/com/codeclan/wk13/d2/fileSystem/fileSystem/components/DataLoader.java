package com.codeclan.wk13.d2.fileSystem.fileSystem.components;

import com.codeclan.wk13.d2.fileSystem.fileSystem.models.File;
import com.codeclan.wk13.d2.fileSystem.fileSystem.models.Folder;
import com.codeclan.wk13.d2.fileSystem.fileSystem.models.User;
import com.codeclan.wk13.d2.fileSystem.fileSystem.repositories.FileRepository;
import com.codeclan.wk13.d2.fileSystem.fileSystem.repositories.FolderRepository;
import com.codeclan.wk13.d2.fileSystem.fileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args){
        User user = new User("Jane");
        userRepository.save(user);

        Folder folder1 = new Folder("Jane's folder", user);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Jane's green folder", user);
        folderRepository.save(folder2);


        File file1 = new File("Important", "doc", 80, folder1);
        File file2 = new File("Not_important", "doc", 70, folder1);
        fileRepository.save(file1);
        fileRepository.save(file2);

        File file3 = new File("Super important", "doc", 80, folder1);
        File file4 = new File("Really not important", "doc", 70, folder2);

        fileRepository.save(file3);
        fileRepository.save(file4);

    }

}

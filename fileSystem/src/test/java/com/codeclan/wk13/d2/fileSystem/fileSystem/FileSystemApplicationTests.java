package com.codeclan.wk13.d2.fileSystem.fileSystem;

import com.codeclan.wk13.d2.fileSystem.fileSystem.models.File;
import com.codeclan.wk13.d2.fileSystem.fileSystem.models.Folder;
import com.codeclan.wk13.d2.fileSystem.fileSystem.models.User;
import com.codeclan.wk13.d2.fileSystem.fileSystem.repositories.FileRepository;
import com.codeclan.wk13.d2.fileSystem.fileSystem.repositories.FolderRepository;
import com.codeclan.wk13.d2.fileSystem.fileSystem.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileSystemApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveUser(){
		User user = new User("Christina");
		userRepository.save(user);
	}

	@Test
	public void canSaveFolder(){
		User user = new User("Sally");
		userRepository.save(user);
		Folder folder1 = new Folder("Stuff", user);
		folderRepository.save(folder1);
	}

	@Test
	public void canSaveFile(){
		User user = new User("Jim");
		userRepository.save(user);
		Folder folder2 = new Folder("Stuff", user);
		folderRepository.save(folder2);
		File file = new File("Important", "doc", 80, folder2);
		fileRepository.save(file);
	}

	@Test
	public void canSaveManyFilesAndFolders(){
		User user = new User("Gary");
		userRepository.save(user);
		Folder folder3 = new Folder("Stuff", user);
		folderRepository.save(folder3);
		Folder folder4 = new Folder("Other stuff", user);
		folderRepository.save(folder4);

		File file1 = new File("Important", "doc", 80, folder3);
		File file2 = new File("Not_important", "doc", 70, folder3);
		fileRepository.save(file1);
		fileRepository.save(file2);

		File file3 = new File("Super important", "doc", 80, folder3);
		File file4 = new File("Totally not important", "doc", 70, folder3);
		fileRepository.save(file3);
		fileRepository.save(file4);
	}


}


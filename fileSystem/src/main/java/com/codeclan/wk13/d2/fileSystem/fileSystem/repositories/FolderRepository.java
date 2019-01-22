package com.codeclan.wk13.d2.fileSystem.fileSystem.repositories;

import com.codeclan.wk13.d2.fileSystem.fileSystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}

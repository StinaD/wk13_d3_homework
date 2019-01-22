package com.codeclan.wk13.d2.fileSystem.fileSystem.repositories;

import com.codeclan.wk13.d2.fileSystem.fileSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

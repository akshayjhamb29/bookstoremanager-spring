package com.rodolfo.bookstoremanager.users.repository;

import com.rodolfo.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

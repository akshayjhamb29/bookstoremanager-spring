package com.rodolfo.bookstoremanager.author.repository;

import com.rodolfo.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}

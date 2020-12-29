package com.rodolfo.bookstoremanager.books.repository;

import com.rodolfo.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

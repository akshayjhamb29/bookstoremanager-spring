package com.rodolfo.bookstoremanager.publishers.repository;

import com.rodolfo.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}

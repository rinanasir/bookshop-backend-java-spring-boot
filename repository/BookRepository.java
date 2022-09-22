package com.vInternship.BookshopBackend.repository;

import com.vInternship.BookshopBackend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookByTitle(String title);
}

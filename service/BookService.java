package com.vInternship.BookshopBackend.service;

import com.vInternship.BookshopBackend.model.Book;
import com.vInternship.BookshopBackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addNewBook(Book book) {
        bookRepository.save(book);
//        return boi+" was saved successfully";
    }

    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    public Object findBookById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public Book findBookByTitle(String title) {
        return bookRepository.findBookByTitle(title);
    }

    public Object updateBookById(Book book) {
        return bookRepository.save(book);
    }

    public void deleteAllBooks() {
        bookRepository.deleteAll();
//        return "All Books Are Deleted";
    }

    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
//        return id+" Book Removed Successfully";
    }
}

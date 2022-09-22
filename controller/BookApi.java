package com.vInternship.BookshopBackend.controller;

import com.vInternship.BookshopBackend.model.Book;
import com.vInternship.BookshopBackend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/home")
public class BookApi {
    @Autowired
    private BookService bookService;

    // POST: Add a Book
    @PostMapping(path = "/addBook")
    public @ResponseBody void addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
    }

    // GET: All Books
    @GetMapping(path = "/allBooks")
    public List<Book> findAllBook(){
        return bookService.findAllBook();
    }

    // GET: A Book By ID
    @GetMapping(path = "/bookById/{id}")
    public Book findBookById(@PathVariable Long id){
        return (Book) bookService.findBookById(id);
    }

    // GET: A Book By Title
    @GetMapping(path = "bookByTitle/{title}")
    public Book findBookByTitle(@PathVariable String title){
        return bookService.findBookByTitle(title);
    }

    // PUT: Update a Book Information
    @PutMapping(path = "/updateBook")
    public Book updateBookById(@RequestBody Book book){
        return (Book) bookService.updateBookById(book);
    }

    // Delete All Book
    @DeleteMapping(path = "/deleteAllBooks")
    public void deleteAllBooks(){
        bookService.deleteAllBooks();
    }

    // Delete a Book By ID
    @DeleteMapping(path = "/deleteBookById/{id}")
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
    }
}

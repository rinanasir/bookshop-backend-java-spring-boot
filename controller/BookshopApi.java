package com.vInternship.BookshopBackend.controller;

import com.vInternship.BookshopBackend.model.Bookshop;
import com.vInternship.BookshopBackend.service.BookshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/home")
public class BookshopApi {
    @Autowired
    private BookshopService bookshopService;

    // POST: Add a Single Bookshop
    @PostMapping(path = "/addBookshop")
    public @ResponseBody void addNewBookshop(@RequestBody Bookshop shop){
        bookshopService.addNewBookshop(shop);
    }

    // GET: All Books
    @GetMapping("/allBookshops")
    public List<Bookshop> findAllBookshops(){
        return bookshopService.findAllBookshops();
    }

    // GET: A Bookshop By ID
    @GetMapping(path = "/bookshopById/{id}")
    public Bookshop findBookshopById(@PathVariable Long id){
        return bookshopService.findBookshopById(id);
    }

    // GET: A Bookshop By Name
    @GetMapping(path = "/bookshopByName")
    public Bookshop findBookshopByShopName(@PathVariable String shopName){
        return bookshopService.findBookshopByShopName(shopName);
    }

    // PUT: Update a Bookshop Information
    @PutMapping(path = "/updateBookshop")
    public Bookshop updateBookshopById(@RequestBody Bookshop shop){
        return (Bookshop) bookshopService.updateBookshopById(shop);
    }

    // Delete All Bookshops
    @DeleteMapping(path = "/deleteAllBookshops")
    public void deleteAllBookshops(){
        bookshopService.deleteAllBookshops();
    }

    // Delete a Bookshop By ID
    @DeleteMapping(path = "/deleteShopById/{id}")
    public void deleteBookshopById(@PathVariable Long id){
        bookshopService.deleteBookshopById(id);
    }
}

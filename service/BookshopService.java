package com.vInternship.BookshopBackend.service;

import com.vInternship.BookshopBackend.model.Bookshop;
import com.vInternship.BookshopBackend.repository.BookshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookshopService {
    @Autowired
    private BookshopRepository bookshopRepository;

    public void addNewBookshop(Bookshop bookshop) {
        bookshopRepository.save(bookshop);
    }

    public List<Bookshop> findAllBookshops() {
        return bookshopRepository.findAll();
    }

    public Bookshop findBookshopById(Long id) {
        return bookshopRepository.findById(id).orElseThrow();
    }

    public Bookshop findBookshopByShopName(String shopName) {
        return bookshopRepository.findBookshopByShopName(shopName);
    }

    public Bookshop updateBookshopById(Bookshop shop) {
        return bookshopRepository.save(shop);
    }

    public void deleteAllBookshops() {
        bookshopRepository.deleteAll();
//        return "All Bookshops Are Deleted";
    }

    public void deleteBookshopById(Long id) {
        bookshopRepository.deleteById(id);
    }
}

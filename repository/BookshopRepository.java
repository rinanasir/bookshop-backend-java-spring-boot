package com.vInternship.BookshopBackend.repository;

import com.vInternship.BookshopBackend.model.Bookshop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookshopRepository extends JpaRepository<Bookshop, Long> {

    Bookshop findBookshopByShopName(String shopName);
}

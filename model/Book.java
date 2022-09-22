package com.vInternship.BookshopBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "price", nullable = false)
    private float price;
    @Column(name = "publish_year", nullable = false)
    private String publishYear;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "genre", nullable = false)
    private String genre;
    @Column(name = "publisher", nullable = false)
    private String publisher;
}

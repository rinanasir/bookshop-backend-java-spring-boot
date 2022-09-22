package com.vInternship.BookshopBackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bookshops")
public class Bookshop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shopId;
    @Column(name = "shop_number", nullable = false)
    private String shopNumber;
    @Column(name = "shop_name", nullable = false)
    private String shopName;
    @Column(name = "location", nullable = false)
    private String location;
    @OneToMany(targetEntity = Book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_id_fk", referencedColumnName = "shopId")
    private List<Book> books;
    @Column(name = "contact_no", nullable = false)
    private String contactNo;
    @Column(name = "email", nullable = false)
    private String email;
}

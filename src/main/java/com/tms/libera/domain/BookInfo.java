package com.tms.libera.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Collection;

@Entity(name = "books")
@Data
public class BookInfo {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    //@SequenceGenerator(name = "book_seq", sequenceName = "books_id_seq", allocationSize = 1)
    private Long id;

   // @Column(name = "book_name")
    private String bookName;

    //@OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    //private Collection<Page> pages;
}


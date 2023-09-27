package com.tms.libera.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Entity(name = "author")
@Data
@EqualsAndHashCode(exclude = {"books"})
@ToString(exclude = {"books"})
public class AuthorInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    @SequenceGenerator(name = "author_seq", sequenceName = "author_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "author_name")
    private String authorName;

    //@ManyToMany(fetch = FetchType.EAGER)
    //private Collection<Book> books;
}

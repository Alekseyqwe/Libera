package com.tms.libera.controller;

import com.tms.libera.domain.AuthorInfo;
//import com.tms.libera.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@RequestMapping(value = "/author")
//public class AuthorController {
//
//    private final AuthorRepository authorRepository;
//
//    @Autowired
//    public AuthorController(AuthorRepository authorRepository) {
//        this.authorRepository = authorRepository;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<AuthorInfo> getAuthorById(@PathVariable int id) {
//        Author author = authorRepository.findById(id);
//        return new ResponseEntity<>(author, HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<AuthorInfo>> getAllAuthors() {
//        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<HttpStatus> createAuthor(@RequestBody AuthorInfo author) {
//        authorRepository.save(author);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//
//    @PutMapping
//    public ResponseEntity<HttpStatus> updateComponentById(@RequestBody AuthorInfo author) {
//        authorRepository.update(author);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<HttpStatus> delete(@RequestBody AuthorInfo author) {
//        authorRepository.delete(author);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//}

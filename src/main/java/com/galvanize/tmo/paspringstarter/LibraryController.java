package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//import Books.java;
@RestController
public class LibraryController {

    private final BooksRepository repository;

    LibraryController(BooksRepository repository) {
    this.repository = repository;
    }


    @GetMapping("/health")
    public void health() {
    
    }

    @GetMapping("/api/books")
        List<Books> all() {
        return repository.findAll();
        }
    /*
    @RequestMapping(value="/api/books", method = RequestMethod.POST)
    Books newBooks(@RequestBody Books newBooks) {
        repository.save(newBooks);
        return newBooks;
    }
    */
    
    @PostMapping(value="/api/books")
    @ResponseStatus(code = HttpStatus.CREATED)
        Books newBooks(@RequestBody Books newBooks) {
        return repository.save(newBooks);
    }

    @DeleteMapping("/api/books")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletall() {
    repository.deleteAll();
  }
    
} 



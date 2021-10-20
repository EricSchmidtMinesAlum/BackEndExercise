package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;


import Books.java;
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

    @PostMapping("/employees")
        Books newBooks(@RequestBody Books newBooks) {
        return repository.save(newBooks);
    }
    
    


    @RequestMapping("/api/books")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

    
} 



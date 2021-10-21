package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;


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
    /*
    @GetMapping("/api/books")
        List<Books> all() {
        return repository.findAll();
        }*/

    
    @GetMapping("/api/books")
        HashMap<String, List<Books>>  all() {            
            //bookShelf.setBooks(repository.findAll());
            //return bookShelf;

            //ObjectNode objectNode = mapper.createObjectNode();

           //objectNode.put("key", "value");
            //return objectNode;
            HashMap<String, List<Books>> map = new HashMap<>();

            //create new list and set it to the repository. Then sort based on title
            List<Books> sortedArray = new ArrayList<Books> ();
            sortedArray = repository.findAll();
            sortedArray.sort(Comparator.comparing(Books::getTitle));


            map.put("books", sortedArray);
            return map;
        }

    
    @PostMapping(value="/api/books")
    @ResponseStatus(code = HttpStatus.CREATED)
        Books newBooks(@RequestBody Books newBooks) {
        return repository.save(newBooks);
    }

    @DeleteMapping("/api/books")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletall() {
        //bookShelf.clearBooks();
        repository.deleteAll();
        repository.flush();
    }
    
} 



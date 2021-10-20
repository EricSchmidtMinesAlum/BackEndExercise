package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import Books;
@RestController
public class LibraryController {

    @Autowired
    UserService userService;

    @GetMapping("/health")
    public void health() {
    
    }
    
    @RequestMapping("/api/books")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

    //POST a new book
    @PostMapping(path = "/api/books", 
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Books> create(@RequestBody Books newbook) {
    Books book = userService.save(newbook);
    if (book == null) {
        throw new ServerException();
    } else {
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
}
} 




}

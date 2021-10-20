package com.galvanize.tmo.paspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class LibraryController {

    @GetMapping("/health")
    public void health() {
    
    }
    
    @RequestMapping("/api/books")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
}

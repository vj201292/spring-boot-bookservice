package com.vj.spring.boot.mongo.bookservice;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/all")
    public List<Book> getAll(){
       return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") int id){
       Book b1= bookRepository.findById(id);
       System.out.println(b1);
       return b1;
    }

    @GetMapping("/isbn/{isbn}")
    public Book findById(@PathVariable("isbn") String isbn){
        Book b1= bookRepository.findByISbn(isbn);
        System.out.println(b1);
        return b1;
    }

    @GetMapping("/title/{title}")
    public Book findByTitle(@PathVariable("title") String title){
        Book b1= bookRepository.findByTitle(title);
        System.out.println(b1);
        return b1;
    }

}

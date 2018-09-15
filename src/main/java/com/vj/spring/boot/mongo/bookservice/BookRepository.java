package com.vj.spring.boot.mongo.bookservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {

    Book findById(int id);

    @Query("{ 'isbn' : ?0 }")
    Book findByISbn(String isbn);


    @Query("{'title' : ?0 }")
    Book findByTitle(String title);

}

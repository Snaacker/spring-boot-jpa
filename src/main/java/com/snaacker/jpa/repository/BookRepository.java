package com.snaacker.jpa.repository;

import com.snaacker.jpa.persistent.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")

public interface BookRepository extends CrudRepository<Book, Long> {}

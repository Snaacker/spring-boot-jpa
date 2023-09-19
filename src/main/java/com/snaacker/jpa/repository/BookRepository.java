package com.snaacker.jpa.repository;

import com.snaacker.jpa.persistent.Book;
import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends CrudRepository<Book, Long> {
    @Query(
            value =
                    "SELECT * FROM book b JOIN author a ON b.author_id = a.id WHERE"
                            + " a.name = :authorName",
            nativeQuery = true)
    Collection<Book> findBookByAuthor(String authorName);
}

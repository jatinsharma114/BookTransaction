package com.LibraryMS.BookIssueDeal.Repository;

import com.LibraryMS.BookIssueDeal.Model.Book;
import com.LibraryMS.BookIssueDeal.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer> {
    List<Book> findByGenre(Genre genre);
}

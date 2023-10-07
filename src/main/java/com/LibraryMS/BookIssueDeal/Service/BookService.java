package com.LibraryMS.BookIssueDeal.Service;


import com.LibraryMS.BookIssueDeal.Model.Author;
import com.LibraryMS.BookIssueDeal.Model.Book;
import com.LibraryMS.BookIssueDeal.Model.Genre;
import com.LibraryMS.BookIssueDeal.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorService authorService;

    public void createBook(Book book){
        //TODO: We need to write the logic for author insertion

        Author author = authorService.createOrGetAuthor(book.getMyAuthor());

        book.setMyAuthor(author);
        bookRepository.save(book);
    }

    public Book getBookById(int id){
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public List<Book> getBookByGenre(String genre) {
        try {
            Genre genre1 = Genre.valueOf(genre);
            return bookRepository.findByGenre(genre1);
        } catch (IllegalArgumentException e) {
            return Collections.emptyList();
        }
    }
}

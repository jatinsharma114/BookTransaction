package com.LibraryMS.BookIssueDeal.Controller;

import com.LibraryMS.BookIssueDeal.Model.Book;
import com.LibraryMS.BookIssueDeal.Model.Genre;
import com.LibraryMS.BookIssueDeal.RequestController.BookRequest;
import com.LibraryMS.BookIssueDeal.Service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void createBook(@Valid @RequestBody BookRequest bookCreateRequest){
        bookService.createBook(bookCreateRequest.to());
    }

    @GetMapping("/book/all")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/book/{bookId}")
    public Book getStudent(@PathVariable("bookId") int bookId){
        return bookService.getBookById(bookId);
    }

    @GetMapping("/bookByGenre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable("genre") String genre) {
        return bookService.getBookByGenre(genre);
    }

}

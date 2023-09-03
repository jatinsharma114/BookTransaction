package com.LibraryMS.BookIssueDeal.RequestController;

import com.LibraryMS.BookIssueDeal.Model.Author;
import com.LibraryMS.BookIssueDeal.Model.Book;
import com.LibraryMS.BookIssueDeal.Model.Genre;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequest {

    @NotBlank
    private String name;

    @NotNull
    private Genre genre;

    // Author details
    @NotBlank
    private String authorName;

    @NotBlank
    @Email
    private String email;


    public Book to() {
        Author author = Author.builder()
                .name(authorName)
                .email(email)
                .build();

        return Book.builder()
                .name(name)
                .genre(genre)
                .myAuthor(author)
                .build();
    }
}

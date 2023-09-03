package com.LibraryMS.BookIssueDeal.Repository;

import com.LibraryMS.BookIssueDeal.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    @Query(value = "select a from Author a where a.email = :email")
    Author findAuthor(String email);
}

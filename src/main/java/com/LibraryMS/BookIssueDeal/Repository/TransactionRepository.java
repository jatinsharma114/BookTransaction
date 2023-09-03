package com.LibraryMS.BookIssueDeal.Repository;

import com.LibraryMS.BookIssueDeal.Model.Book;
import com.LibraryMS.BookIssueDeal.Model.Student;
import com.LibraryMS.BookIssueDeal.Model.Transaction;
import com.LibraryMS.BookIssueDeal.Model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository  extends JpaRepository<Transaction, Integer> {

    List<Transaction> findByBookAndStudentAndTransactionTypeOrderByIdDesc(
            Book book, Student student,
            TransactionType transactionType);
}

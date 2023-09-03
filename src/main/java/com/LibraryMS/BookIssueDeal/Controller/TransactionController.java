package com.LibraryMS.BookIssueDeal.Controller;


import com.LibraryMS.BookIssueDeal.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {


    @Autowired
    TransactionService transactionService;

    @PostMapping("/transaction/issue")
    public String issueBook(@RequestParam("bookId") int bookId,
                            @RequestParam("studentId") int studentId) throws Exception {

        return transactionService.issueBook(studentId, bookId);
    }

    @PostMapping("/transaction/return")
    public String returnBook(@RequestParam("bookId") int bookId,
                             @RequestParam("studentId") int studentId) throws Exception{

        return transactionService.returnBook(studentId, bookId);
    }
}

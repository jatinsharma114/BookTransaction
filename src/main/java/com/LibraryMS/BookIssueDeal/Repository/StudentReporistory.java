package com.LibraryMS.BookIssueDeal.Repository;

import com.LibraryMS.BookIssueDeal.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReporistory  extends JpaRepository<Student, Integer> {
}

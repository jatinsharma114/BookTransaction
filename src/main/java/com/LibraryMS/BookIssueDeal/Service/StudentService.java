package com.LibraryMS.BookIssueDeal.Service;

import com.LibraryMS.BookIssueDeal.Model.Student;
import com.LibraryMS.BookIssueDeal.Repository.StudentReporistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {


    @Autowired
    StudentReporistory studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}

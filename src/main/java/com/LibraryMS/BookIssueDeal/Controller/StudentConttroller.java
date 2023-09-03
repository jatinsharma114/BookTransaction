package com.LibraryMS.BookIssueDeal.Controller;

import com.LibraryMS.BookIssueDeal.Model.Student;
import com.LibraryMS.BookIssueDeal.RequestController.StudentRequest;
import com.LibraryMS.BookIssueDeal.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentConttroller {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public void createStudent(@Valid @RequestBody StudentRequest studentCreateRequest){
        studentService.createStudent(studentCreateRequest.to());
    }

    @GetMapping("/student/all")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    }
}

package com.LibraryMS.BookIssueDeal.RequestController;

import com.LibraryMS.BookIssueDeal.Model.Student;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequest {

    @Positive
    private int age;

    @NotBlank
    private String name;

    private String phoneNumber;

    @NotBlank
    @Email
    private String email;

    public Student to(){
        return Student.builder()
                .name(name)
                .age(age)
                .email(email)
                .phoneNumber(phoneNumber)
                .build();
    }
}

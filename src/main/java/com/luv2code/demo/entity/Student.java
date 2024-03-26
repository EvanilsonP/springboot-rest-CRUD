package com.luv2code.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String firstName;
    private String lastName;


    Student() {

    }
    

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

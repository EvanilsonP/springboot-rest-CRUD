package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define an endpoint for "students" - return a list of students
    @RequestMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Laila", "Patel"));
        theStudents.add(new Student("Leilo", "Pavolas"));
        theStudents.add(new Student("Laiaco", "Timateos"));
        return theStudents;
    }
}

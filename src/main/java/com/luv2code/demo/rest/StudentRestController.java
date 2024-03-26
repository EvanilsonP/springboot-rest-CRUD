package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    // define @PostConstruct to load the student data... only once
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Laila", "Patel"));
        theStudents.add(new Student("Leilo", "Pavolas"));
        theStudents.add(new Student("Laiaco", "Timateos"));
    }
    // define an endpoint for "students" - return a list of students
    @RequestMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    @RequestMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // just index into the list... keep it simple for now
        return theStudents.get(studentId);
    }
}

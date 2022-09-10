package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    };


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    };

    @PostMapping
    public void postStudent(@RequestParam String name) {
        System.out.println("name of student is " + name);
    };

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        // I just make a request in the url:   localhost:8080/hello?name=ciaociao
        System.out.println("name is " + name);
        return String.format("Hello %s!", name);
    };
}

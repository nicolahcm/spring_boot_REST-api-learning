package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    };


    @ModelAttribute
    public void getStudents(Model model) {
        model.addAttribute("students",studentService.getStudents());
    }

    @GetMapping
    public String getViewStudents() {

//        return studentService.getStudents();
        return "studentView";
    };

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentService.postStudent(student);
        System.out.println("Student SAVED!");
    }


}

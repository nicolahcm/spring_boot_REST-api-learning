package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void postStudent(Student student) {
        studentRepository.save(student);
        System.out.println("Student saved!");
    }


//    public List<Student> getStudents() {
//        System.out.println("used");
//        return List.of(
//                new Student(1L, "mariam", "hey@gm.com", LocalDate.of(2000, Month.JANUARY, 5), 21)
//        );
//    };
}

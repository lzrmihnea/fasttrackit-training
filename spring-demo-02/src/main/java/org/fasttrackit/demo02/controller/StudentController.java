package org.fasttrackit.demo02.controller;

import org.fasttrackit.demo02.model.Student;
import org.fasttrackit.demo02.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService service) {
        this.studentService = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getSampleText() {
        return ResponseEntity.ok("<h1>There are no students</h1> <br> <h2>Asta e!</h2>");
    }

    @GetMapping("/api/students")
    public ResponseEntity<List<Student>> getAllStudents(
            @RequestParam(name = "lastname", required = false) String searchByLastname) {

        if (searchByLastname != null && !searchByLastname.isBlank()) {
            return ResponseEntity.ok(studentService.findAllByLastname(searchByLastname));
        }
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/api/students")
    public ResponseEntity createOrUpdateStudent(@RequestBody Student studentRequest) {
        this.studentService.createOrUpdateStudent(studentRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/students/{id}")
    public void deleteStudentById(@PathVariable("id") Long studentId) {
        this.studentService.deleteStudentById(studentId);
    }
}

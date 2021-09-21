package org.fasttrackit.demo02.controller;

import org.fasttrackit.demo02.service.StudentService;
import org.fasttrackit.demo02.service.model.StudentDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;
    @Value("${myproperty.value}")
    private String messageFromPropertyFile;

    public StudentController(StudentService service) {
        this.studentService = service;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getSampleText() {
        return ResponseEntity.ok("<h1>There are no students</h1> <br> "
                + messageFromPropertyFile);
    }

    @GetMapping("/api/students")
    public ResponseEntity<List<StudentDto>> getAllStudents(
            @RequestParam(name = "lastname", required = false) String searchByLastname) {

        if (searchByLastname != null && !searchByLastname.isBlank()) {
            return ResponseEntity.ok(studentService.findAllByLastname(searchByLastname));
        }
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/api/students")
    public ResponseEntity createOrUpdateStudent(@RequestBody StudentDto studentRequest) {
        this.studentService.createOrUpdateStudent(studentRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/students/{id}")
    public void deleteStudentById(@PathVariable("id") Long studentId) {
        this.studentService.deleteStudentById(studentId);
    }

    @GetMapping("/api/students-pop")
    public ResponseEntity<List<StudentDto>> getAllStudentsNamedPop() {
        return ResponseEntity.ok(studentService.findAllNamedPop());
    }
}

package org.fasttrackit.demo02.service;

import org.fasttrackit.demo02.model.Student;
import org.fasttrackit.demo02.repository.StudentRepository;
import org.fasttrackit.demo02.repository.dao.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        final List<StudentEntity> all = this.studentRepository.findAll();
        return all.stream()
                .map(studentEntity -> {
                    Student createdStudent = new Student();
                    createdStudent.setId(studentEntity.getId());
                    createdStudent.setFirstname(studentEntity.getFirstname());
                    createdStudent.setLastname(studentEntity.getLastname());
                    createdStudent.setDateOfBirth(studentEntity.getDateOfBirth());
                    return createdStudent;
                })
                .collect(Collectors.toList());
    }

    public List<Student> findAllByLastname(String lastname) {
        return this.studentRepository.findAllByLastnameContains(lastname).stream()
                .map(studentEntity -> {
                    Student createdStudent = new Student();
                    createdStudent.setId(studentEntity.getId());
                    createdStudent.setFirstname(studentEntity.getFirstname());
                    createdStudent.setLastname(studentEntity.getLastname());
                    createdStudent.setDateOfBirth(studentEntity.getDateOfBirth());
                    return createdStudent;
                })
                .collect(Collectors.toList());
    }

    public void createOrUpdateStudent(Student toCreate) {
        StudentEntity createOrUpdateMe = new StudentEntity();
        createOrUpdateMe.setId(toCreate.getId());
        createOrUpdateMe.setFirstname(toCreate.getFirstname());
        createOrUpdateMe.setLastname(toCreate.getLastname());
        createOrUpdateMe.setDateOfBirth(toCreate.getDateOfBirth());
        this.studentRepository.save(createOrUpdateMe);
    }

    public void deleteStudentById(Long studentIdToDelete) {
        this.studentRepository.deleteById(studentIdToDelete);
    }

}

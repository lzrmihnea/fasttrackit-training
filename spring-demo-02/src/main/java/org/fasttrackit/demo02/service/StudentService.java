package org.fasttrackit.demo02.service;

import org.fasttrackit.demo02.repository.StudentRepository;
import org.fasttrackit.demo02.repository.dao.ExamResultEntity;
import org.fasttrackit.demo02.repository.dao.StudentEntity;
import org.fasttrackit.demo02.service.model.ExamResultDto;
import org.fasttrackit.demo02.service.model.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDto> getAllStudents() {
        final List<StudentEntity> all = this.studentRepository.findAll();
        return all.stream()
                .map(this::mapToStudentDto)
                .collect(Collectors.toList());
    }

    public List<StudentDto> findAllByLastname(String lastname) {

        return this.studentRepository.findAllByLastnameContains(lastname).stream()
                .map(studentEntity -> {
                    StudentDto createdStudent = new StudentDto();
                    createdStudent.setId(studentEntity.getId());
                    createdStudent.setFirstname(studentEntity.getFirstname());
                    createdStudent.setLastname(studentEntity.getLastname());
                    createdStudent.setDateOfBirth(studentEntity.getDateOfBirth());
                    return createdStudent;
                })
                .collect(Collectors.toList());
    }

    public void createOrUpdateStudent(StudentDto toCreate) {
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

    public List<StudentDto> findAllNamedPop() {
        return this.studentRepository.findAllNamedPop()
                .stream()
                .map(this::mapToStudentDto)
                .collect(Collectors.toList());
    }

    private StudentDto mapToStudentDto(StudentEntity studentEntity) {
        StudentDto createdStudent = new StudentDto();
        createdStudent.setId(studentEntity.getId());
        createdStudent.setFirstname(studentEntity.getFirstname());
        createdStudent.setLastname(studentEntity.getLastname());
        createdStudent.setDateOfBirth(studentEntity.getDateOfBirth());
        createdStudent.setResults(studentEntity.getResults()
                .stream()
                .map(this::mapToExamResultsDto)
                .collect(Collectors.toSet()));
        return createdStudent;
    }

    private ExamResultDto mapToExamResultsDto(ExamResultEntity resultEntity) {
        ExamResultDto resultDto = new ExamResultDto();
        resultDto.setId(resultEntity.getId());
        resultDto.setName(resultEntity.getName());
        resultDto.setSubject(resultEntity.getSubject());
        resultDto.setMark(resultEntity.getMark());
        return resultDto;
    }

}

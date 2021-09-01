package org.fasttrackit.demo02.service;

import org.fasttrackit.demo02.model.Student;
import org.fasttrackit.demo02.repository.StudentRepository;
import org.fasttrackit.demo02.repository.dao.StudentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @InjectMocks
    StudentService service; // this will be tested
    @Mock
    StudentRepository repository; // this is a mock

    @Test
    void getAllStudents_expectedEmptyList() {
        List<Student> expectedStudents = service.getAllStudents();

        Assertions.assertTrue(expectedStudents.isEmpty());
    }

    @Test
    void getAllStudents_expectedListWithSingleStudent() {
        StudentEntity expectedFromDb = new StudentEntity();
        expectedFromDb.setId(101L);
        expectedFromDb.setFirstname("Anna");
        expectedFromDb.setLastname("Karenina");
        List<StudentEntity> studentsFromDb = new ArrayList<>();
        studentsFromDb.add(expectedFromDb);
        Mockito.when(this.repository.findAll()).thenReturn(studentsFromDb);

        List<Student> expectedStudents = service.getAllStudents();
        Assertions.assertEquals(1, expectedStudents.size());
        Student actualStudent = expectedStudents.get(0);
        Assertions.assertEquals(101L, actualStudent.getId());
        Assertions.assertEquals("Anna", actualStudent.getFirstname());
        Assertions.assertEquals("Karenina", actualStudent.getLastname());
    }
}
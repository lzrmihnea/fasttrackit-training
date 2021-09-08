package org.fasttrackit.demo02.service;

import org.fasttrackit.demo02.model.Student;
import org.fasttrackit.demo02.repository.StudentRepository;
import org.fasttrackit.demo02.repository.dao.StudentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @InjectMocks
    StudentService service; // this will be tested
    @Mock
    StudentRepository studentRepositoryMock; // this is a mock

    @Test
    void getAllStudents_expectedListWithSingleStudent() {
        // 1. Given (we define test data input & mocks)
        StudentEntity expectedFromDb = new StudentEntity();
        expectedFromDb.setId(101L);
        expectedFromDb.setFirstname("Anna");
        expectedFromDb.setLastname("Karenina");
        List<StudentEntity> studentsFromDb = new ArrayList<>();
        studentsFromDb.add(expectedFromDb);
        Mockito.when(this.studentRepositoryMock.findAll()).thenReturn(studentsFromDb);

        // 2. When (we call the code which we want to test)
        List<Student> expectedStudents = service.getAllStudents();

        // 3. Then (we check if what we defined at 1. is what happened at 2.
        Assertions.assertEquals(1, expectedStudents.size());
        Student actualStudent = expectedStudents.get(0);
        Assertions.assertEquals(101L, actualStudent.getId());
        Assertions.assertEquals("Anna", actualStudent.getFirstname());
        Assertions.assertEquals("Karenina", actualStudent.getLastname());
    }

    @Test
    void getAllStudents_expectedEmptyList() {
        // 2. When
        List<Student> expectedStudents = service.getAllStudents();

        // 3. Then
        Assertions.assertTrue(expectedStudents.isEmpty());
    }

    @Test
    void getAllStudents_expectedRepositoryFindAllMethodCalled() {
        // 2. When
        this.service.getAllStudents();

        // 3. Then
        Mockito.verify(this.studentRepositoryMock).findAll();
    }

    @Test
    void deleteStudentById_expectedRepositoryDeleteByIdCalled() {
        // 2. When
        this.service.deleteStudentById(105L);

        // 3. Then
        Mockito.verify(this.studentRepositoryMock).deleteById(105L);
    }

    @Test
    void createOrUpdateStudent_expectedRepositorySaveMethodCalled() {
        Student toSave = new Student();
        toSave.setId(3L);
        toSave.setFirstname("a");
        toSave.setLastname("b");
        toSave.setDateOfBirth(new Date());

        this.service.createOrUpdateStudent(toSave);

        Mockito.verify(this.studentRepositoryMock)
                .save(ArgumentMatchers.any(StudentEntity.class));
    }
}
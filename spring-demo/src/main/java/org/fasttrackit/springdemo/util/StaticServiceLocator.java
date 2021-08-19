package org.fasttrackit.springdemo.util;

import org.fasttrackit.springdemo.HumanService;
import org.fasttrackit.springdemo.model.Professor;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.repository.Repository;

/**
 * Spring pretty much does this out-of-the-box
 */
public class StaticServiceLocator {

    private static final Repository<Student> STUDENT_REPOSITORY = new Repository<>();
    private static final Repository<Professor> PROFESSOR_REPOSITORY = new Repository<>();
    private static final HumanService HUMAN_SERVICE = new HumanService(getStudentRepository(), getProfessorRepository());

    public static Repository<Student> getStudentRepository() {
        return STUDENT_REPOSITORY;
    }

    public static Repository<Professor> getProfessorRepository() {
        return PROFESSOR_REPOSITORY;
    }

    public static HumanService getHumanService() {
        return HUMAN_SERVICE;
    }
}

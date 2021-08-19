package org.fasttrackit.springdemo;

import org.fasttrackit.springdemo.model.Professor;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.repository.Repository;
import org.fasttrackit.springdemo.util.StaticServiceLocator;

public class InjectionDemoRunner {

    public static void main(String[] args) {
        Repository<Student> studentRepositoryToInject = new Repository<>();
        Repository<Professor> professorRepositoryToInject = new Repository<>();
//        Repository<Student> studentRepositoryToInject = StaticServiceLocator.getStudentRepository();
//        Repository<Professor> professorRepositoryToInject = StaticServiceLocator.getProfessorRepository();

        HumanService humanService = new HumanService(
                studentRepositoryToInject,
                professorRepositoryToInject);
//        HumanService humanService = StaticServiceLocator.getHumanService();

        // new CourseService(studentRepositoryToInject);
        // new AssignmentService(studentRepositoryToInject);
        // [...]

        humanService.getAllHumans();
        humanService.addRandomProfessor();
        humanService.addRandomStudent();
    }
}

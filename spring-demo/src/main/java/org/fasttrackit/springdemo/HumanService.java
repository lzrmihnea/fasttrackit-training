package org.fasttrackit.springdemo;

import org.fasttrackit.springdemo.model.Human;
import org.fasttrackit.springdemo.model.Professor;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class HumanService {
    private Repository<Student> studentRepository;
    private Repository<Professor> professorRepository;

    public HumanService(Repository<Student> injectedStudentRepository,
                        Repository<Professor> injectedProfessorRepository) {
        this.studentRepository = injectedStudentRepository;
        this.professorRepository = injectedProfessorRepository;
    }

    public List<Human> getAllHumans() {
        List<Human> allHumans = new ArrayList<>();
        allHumans.addAll(this.studentRepository.getAll());
        allHumans.addAll(this.professorRepository.getAll());
        return allHumans;
    }

    public void addRandomStudent() {
        this.studentRepository.add(new Student());
    }

    public void addRandomProfessor() {
        this.professorRepository.add(new Professor());
    }

//  possible, used, not necessarily recommended, because for multiple dependencies, one can remain null.
//    public void setProfessorRepository(Repository<Professor> professorRepository) {
//        this.professorRepository = professorRepository;
//    }
}

package org.fasttrackit.demo02.repository;

import org.fasttrackit.demo02.repository.dao.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    List<StudentEntity> findAllByLastnameContains(String lastname);
}

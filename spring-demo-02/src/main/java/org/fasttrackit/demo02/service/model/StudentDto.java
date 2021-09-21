package org.fasttrackit.demo02.service.model;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

/**
 * DTO = Data Transmission Object (is a plain old Java object)
 */
public class StudentDto {
    private Long id;
    private String lastname;
    private String firstname;
    private Date dateOfBirth;
    private Set<ExamResultDto> results;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        return Objects.equals(id, that.id) && Objects.equals(lastname, that.lastname) && Objects.equals(firstname, that.firstname) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastname, firstname, dateOfBirth, results);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<ExamResultDto> getResults() {
        return results;
    }

    public void setResults(Set<ExamResultDto> results) {
        this.results = results;
    }
}

package org.fasttrackit.demo02.repository.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity(name = "exam_result")
public class ExamResultEntity {
    @Id
    private Long id;
    @Column
    private String subject;
    @Column
    private String name;
    @Column
    private Integer mark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResultEntity that = (ExamResultEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(subject, that.subject) && Objects.equals(name, that.name) && Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, name, mark);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}

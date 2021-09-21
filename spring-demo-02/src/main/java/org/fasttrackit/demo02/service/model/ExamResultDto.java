package org.fasttrackit.demo02.service.model;

import java.util.Objects;

public class ExamResultDto {
    private Long id;
    private String subject;
    private String name;
    private Integer mark;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResultDto that = (ExamResultDto) o;
        return Objects.equals(id, that.id) && Objects.equals(subject, that.subject) && Objects.equals(name, that.name) && Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, name, mark);
    }
}

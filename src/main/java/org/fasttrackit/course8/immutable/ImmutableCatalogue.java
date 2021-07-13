package org.fasttrackit.course8.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableCatalogue {
    private String studentFirstname;
    private String studentLastname;
    private List<String> subjects;

    public ImmutableCatalogue(String studentFirstname,
                              String studentLastname,
                              List<String> subjects) {
        this.studentFirstname = studentFirstname;
        this.studentLastname = studentLastname;

        /**
         * By creating a copied list, we break the link to the outside reference.
         * We only keep the inner value.
         */
        this.subjects = new ArrayList(subjects);
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    /**
     * For this getter, we do not return the actual list.
     * Instead, we return a copy of the list, to keep immutability
     */
    public List<String> getSubjects() {
        return new ArrayList(subjects);
    }

    @Override
    public String toString() {
        return "ImmutableCatalogue{" +
                "studentFirstname='" + studentFirstname + '\'' +
                ", studentLastname='" + studentLastname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

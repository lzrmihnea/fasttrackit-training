package org.fasttrackit.course8.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogueRunner {
    public static void main(String[] args) {
        List<String> subj1 = createSubjects();
        List<String> subj2 = createSubjects("romana");
        List<String> subj3 = createSubjects("engleza", "franceza");
        List<String> subj4 = createSubjects("matematica", "fizica", "chimie");

        ImmutableCatalogue cat1 = new ImmutableCatalogue("Ion", "Pop", subj4);

        System.out.println(cat1);

        cat1.getSubjects().add(1, "informatica");
        subj4.add("biologie");
        subj3.add("latina");

        System.out.println(cat1);
    }

    /**
     *
     * @param subjects var-args (can be any number of elements, from 0 to n)
     * @return
     */
    public static List<String> createSubjects(String... subjects) {
        List<String> toAdd = new ArrayList<>();
        for(String subj: subjects) {
            toAdd.add(subj);
        }
        return toAdd;
    }


}

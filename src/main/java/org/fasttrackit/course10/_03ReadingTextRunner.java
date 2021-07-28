package org.fasttrackit.course10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _03ReadingTextRunner {

    public static void readFileWithTryCatch() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
        try {
            String firstLine = reader.readLine();
        } catch (IOException e) {
            System.out.println("Cannot read first line from text.txt: " + e.getMessage());
        } finally {
            reader.close();
        }
    }

    public static void readFileWithTryWithResources() {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            String firstLine = reader.readLine();
        } catch (IOException ioe) {
            System.out.println("Cannot read first line from text.txt: " + ioe.getMessage());
        }
    }
}

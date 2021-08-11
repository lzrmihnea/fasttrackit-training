package org.fasttrackit.course12;

import java.io.*;

public class ReadFromFileBr {

    public static void main(String[] args) throws IOException {
        File file =
                new File("c:\\work\\docs\\test.txt");
        BufferedReader br = new BufferedReader(
                new FileReader(file));

        String st = br.readLine();
        while(st != null) {
            System.out.println(st);
            st = br.readLine();
        }
    }
}

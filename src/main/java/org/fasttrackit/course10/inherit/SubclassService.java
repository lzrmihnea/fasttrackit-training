package org.fasttrackit.course10.inherit;

import java.io.FileNotFoundException;

public class SubclassService extends SuperclassService {
    /**
     * From this method, we can throw either the exact same exception
     * as in the superclass method (IOException)
     * OR a subclass exception type ( something that extends IOException )
     *
     * @throws FileNotFoundException (which extends IOException)
     */
    @Override
    public void printSomething(String toPrint) throws FileNotFoundException {
        System.out.println("Subclass printing");
    }
}

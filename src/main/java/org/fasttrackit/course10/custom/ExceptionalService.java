package org.fasttrackit.course10.custom;

public class ExceptionalService {

//    public static void main(String[] args) throws CustomCheckedException {
//        throw new CustomCheckedException("Custom exception");
//    }

    public static void main(String[] args) { // we do not need a 'throws' in the signature
        throw new CustomUncheckedException("Custom Unchecked Exception");
    }
}

package org.fasttrackit.course10.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculationService {

    private static final Logger LOGGER = Logger.getLogger(CalculationService.class.getName());

    public Long getArea(String width, String length) {
        // validation logic
        long widthNumber;
        long lengthNumber;
        try {
            widthNumber = Long.parseLong(width);
            lengthNumber = Long.parseLong(length);
            return widthNumber * lengthNumber;
        } catch (NumberFormatException nfe) {
            LOGGER.severe("Invalid numbers given: " + width + ", " + length);
            return null;
        }
    }

}

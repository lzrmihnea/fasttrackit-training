package org.fasttrackit.course4.statement;

import org.fasttrackit.course4.CarTypeEnum;

import java.time.DayOfWeek;

public class SwitchStatement {

    public static void main(String[] args) {
//        printSomethingDependingOnCarTypeWithIfElse(CarTypeEnum.SUV);
//        printSomethingDependingOnCarTypeWithIfElse(CarTypeEnum.HATCHBACK);
//        printSomethingDependingOnCarTypeWithIfElse(CarTypeEnum.BREAK);
//        printSomethingDependingOnCarTypeWithIfElse(CarTypeEnum.SUBMARINE);
//        printSomethingDependingOnCarTypeWithIfElse(null);

        printSomethingDependingOnCarTypeWithSwitch(CarTypeEnum.BREAK);

        printMoodOnDayOfWeek(DayOfWeek.WEDNESDAY);

    }

    private static void printSomethingDependingOnCarTypeWithSwitch(CarTypeEnum carType) {
        switch(carType) { // We can use in the switch: Enums, Strings, Whole numbers (short, byte, int, long)
            case BREAK:
            case HATCHBACK:
                System.out.println("sw: Mi-am luat masina medie");
                break; // if this is missing, it will continue to the next case automatically
            case SUV:
                System.out.println("sw: Mi-am luat masina mare");
                break; // if this is missing, it will continue to the next case automatically
            default:
                System.out.println("sw: Nu mi-am luat nicio masina");
                break; // if this is missing, it will continue to the next case automatically
        }
    }

    private static void printSomethingDependingOnCarTypeWithIfElse(CarTypeEnum carType) {
        if (carType == CarTypeEnum.BREAK) {
            System.out.println("Mi-am luat masina medie");
        } else if (carType == CarTypeEnum.SUV) {
            System.out.println("Mi-am luat masina mare");
        } else if (carType == CarTypeEnum.ELECTRIC) {
            System.out.println("Mi-am luat masina nepoluanta");
        } else if (carType == CarTypeEnum.HATCHBACK) {
            System.out.println("Mi-am luat masina sport");
        } else {
            System.out.println("Nu mi-am luat nicio masina");
        }
    }

    private static void printMoodOnDayOfWeek(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
                System.out.println("of, viata mea");
                break;
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("merge munca");
                break;
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println("uraa, weekend");
                break;
        }
    }
}

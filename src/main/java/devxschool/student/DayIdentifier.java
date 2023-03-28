package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class DayIdentifier {

    public static void main(String[] args) {
        /**
         *
         * Write a Java program that keeps a number from the user between 1 and 7 and displays the name of the weekday.
         *
         * example output:
         * Enter a number to get day of the week
         * 1
         * You selected Monday!
         *
         * another output:
         * Enter a number to get day of the week
         * 8
         * You selected Wrong Day!
         *
         */

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        String day = "";

        //TODO implement your code here...
        System.out.println("Enter a number to get day of the week");

        if (scanner.hasNextInt()) {
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    System.out.println("You selected Wrong Day!");
                    Validation.testDayIdentifier(input, day);
                    return;
            }
            System.out.println("You selected " + day + "!");
            Validation.testDayIdentifier(input, day);
        } else {
            System.out.println("Invalid input!");
            Validation.testDayIdentifier(input, day);
        }
    }
}

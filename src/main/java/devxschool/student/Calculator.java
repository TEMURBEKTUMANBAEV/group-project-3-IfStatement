package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";

    public static void main(String[] args) {

        /**
         *
         * Write a calculator program
         * if there is an invalid operator return result as -1
         *
         * Example output:
         *  Enter your first number:
         *  1
         *   Enter your operator:
         *  /
         *  Enter your second number:
         *  0
         *  Your result is Infinity
         */

        Scanner scanner;
        double number1 = 0;
        double number2 = 0;
        String operator = "";
        double result = 0;

        scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        number1 = scanner.nextDouble();
        System.out.println("Enter your operator:");
        operator = scanner.next();
        System.out.println("Enter your second number:");
        number2 = scanner.nextDouble();
        switch (operator) {
            case PLUS:
                result = number1 + number2;
                break;
            case MINUS:
                result = number1 - number2;
                break;
            case DIVIDE:
                if (number2 == 0) {
                    System.out.println("Your result is Infinity");
                    return;
                }
                result = number1 / number2;
                break;
            case MULTIPLY:
                result = number1 * number2;
                break;
            default:
                System.out.println("Invalid operator");
                result = -1;
                break;
        }
        System.out.println("Your result is " + result);
        Validation.testCalculator(number1, operator, number2, result);
    }
}

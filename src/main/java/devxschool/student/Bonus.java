package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import  java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        /**
         *
         * A company decided to give a bonus of 3% if his/her year of service is more than 3 years inclusively and 5% to employee if his/her year of service is more than 5 years exclusively.
         * Ask user for their salary and year of service and print the net bonus amount.
         *
         * example output:
         * Enter you salary:
         * 100000
         * Enter years of service:
         * 3
         * Your bonus is 3000.0
         */
        Scanner input = new Scanner(System.in);

        System.out.println("What is your yearly salary?");
        int salary = input.nextInt();
        System.out.println("How many years have you been working at company X?");
        int yearOfService = input.nextInt();
        double bonus = 3000;
        if (yearOfService >= 3 && yearOfService < 5) {
            System.out.println("Your bonus is " +salary*0.3);
        } else if (yearOfService >= 5) {
            System.out.println("Your bonus is " +salary*0.5);
        }


        System.out.println("Your bonus is " +bonus*0.3);


        //ignore this
        Validation.testBonus(salary, yearOfService, bonus);
    }
}

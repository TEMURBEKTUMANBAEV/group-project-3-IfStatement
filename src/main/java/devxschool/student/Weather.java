package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        /**
         *
         * Write Java program to allow the user to input weather and temperature outside.
         * Then the program will show if person needs to take umbrella, coat, sunglasses, or combination of items.
         * Umbrella to take if weather is snowy or rainy and temperature is more than 50 inclusively, Sunglasses to take if it's sunny and temperature more is than 50 inclusively
         * If it's colder than 50 Fahrenheit, and the weather is either snowy or rainy, person will take both umbrella and coat
         * Person will take only coat if its sunny, but temperature less than 50
         *
         *
         * example output:
         * Enter weather outside(rainy, snowy, sunny):
         * sunny
         * Enter temperature outside:
         * 60
         *
         * Please take sunglasses, thanks
         *
         * example output:
         *
         * Enter weather outside(rainy, snowy, sunny):
         * snowy
         * Enter temperature outside:
         * 40
         *
         * Please take umbrella and coat, thanks!
         *
         */


        Scanner scanner;
        String weather = "";
        double temperature = 32;
        String thingsToTake = "";


        //TODO implement your code here...
        scanner = new Scanner(System.in);

        System.out.println("Enter weather outside(rainy, snowy, sunny):");
        weather = scanner.nextLine().toLowerCase();

        System.out.println("Enter temperature outside:");
        temperature = scanner.nextDouble();

        if (weather.equals("rainy") || weather.equals("snowy")) {
            if (temperature >= 50) {
                thingsToTake = "umbrella";
            } else {
                thingsToTake = "umbrella and coat";
            }
        } else if (weather.equals("sunny")) {
            if (temperature >= 50) {
                thingsToTake = "sunglasses";
            } else {
                thingsToTake = "coat";
            }
        }

        System.out.println("Please take " + thingsToTake + ", thanks!");


        //ignore this...
        Validation.testWeather(temperature, weather, thingsToTake);
    }
}

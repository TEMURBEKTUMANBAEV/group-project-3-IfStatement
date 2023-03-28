package main.java.devxschool.test;

public class Validation {
    public static void testBonus(int salary, int yearsOfExperience, double bonus) {
        double expected = 0;
        switch (yearsOfExperience) {
            case -1:
            case 0:
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                expected = salary * 0.03;
                break;
            default:
                expected = salary * 0.05;
        }
        if (expected != bonus) {
            throw new ArithmeticException("Check your function! \nactual: " + bonus + "\nexpected: " + expected);
        }
    }

    public static void testCalculator(double number1, String operator, double number2, double result) {
        double expected = -1;
        switch (operator) {
            case "+":
                expected = number1 + number2;
                break;
            case "-":
                expected = number1 - number2;
                break;
            case "*":
                expected = number1 * number2;
                break;
            case "/":
                expected = number1 / number2;
                break;
        }
        if (expected != result) {
            throw new ArithmeticException("Check your function! \nactual: " + result + "\nexpected: " + expected);
        }
    }

    public static void testDayIdentifier(int input, String day) {
        String expected;
        switch (input) {
            case 1:
                expected = "Monday";
                break;
            case 2:
                expected = "Tuesday";
                break;
            case 3:
                expected = "Wednesday";
                break;
            case 4:
                expected = "Thursday";
                break;
            case 5:
                expected = "Friday";
                break;
            case 6:
                expected = "Saturday";
                break;
            case 7:
                expected = "Sunday";
                break;
            default:
                expected = "Wrong Day";
        }
        if (!expected.equals(day)) {
            throw new ArithmeticException("Check your function! \nactual: " + day + "\nexpected: " + expected);
        }
    }


    public static void testNumber(int number, String value) {
        boolean isCorrect;
        switch (value) {
            case "negative":
                isCorrect = number < 0;
                break;
            case "positive":
                isCorrect = number > 0;
                break;
            case "zero":
                isCorrect = number == 0;
                break;
            default:
                throw new RuntimeException("Expected results are \"negative\" | \"positive\" | \"zero\"");
        }
        if (!isCorrect) {
            throw new RuntimeException("Your result is Incorrect!!!");
        }
    }

    public static void testGreatestNumber(int num1, int num2, int num3, String greatestNum) {
        boolean isCorrect;
        switch (greatestNum) {
            case "1":
                isCorrect = num1 > num2 && num1 > num3;
                break;
            case "2":
                isCorrect = num2 > num1 && num2 > num3;
                break;
            case "3":
                isCorrect = num3 > num2 && num1 < num3;
                break;
            case "1 & 2":
                isCorrect = num1 == num2 && num1 > num3;
                break;
            case "1 & 3":
                isCorrect = num3 == num1 && num1 > num2;
                break;
            case "2 & 3":
                isCorrect = num3 == num2 && num1 < num3;
                break;
            case "1 & 2 & 3":
                isCorrect = num3 == num2 && num1 == num3;
                break;
            default:
                throw new RuntimeException("Incorrect result " + greatestNum);
        }
        if (!isCorrect) {
            throw new RuntimeException("Your result is Incorrect!!!");
        }
    }

    public static void testWeather(double temperature, String weather, String thingsToTake) {
        if (temperature >= 50 && weather.equalsIgnoreCase("sunny")) {
            if (!thingsToTake.equalsIgnoreCase("sunglasses")) {
                throw new RuntimeException("Incorrect result. Expected to see 'sunny', but was: " + thingsToTake);
            }
        } else if (temperature < 50 && (weather.equalsIgnoreCase("snowy") || weather.equalsIgnoreCase("rainy"))) {
            if (!thingsToTake.equalsIgnoreCase("umbrella and coat")) {
                throw new RuntimeException("Incorrect result. Expected to see 'umbrella and coat', but was: " + thingsToTake);
            }
        } else if (temperature >= 50 && (weather.equalsIgnoreCase("snowy") || weather.equalsIgnoreCase("rainy"))) {
            if (!thingsToTake.equalsIgnoreCase("umbrella")) {
                throw new RuntimeException("Incorrect result. Expected to see 'umbrella', but was: " + thingsToTake);
            }
        } else {
            if (!thingsToTake.equalsIgnoreCase("coat")) {
                throw new RuntimeException("Incorrect result. Expected to see 'coat', but was: " + thingsToTake);
            }
        }
    }

    public static void testNumber(int number) {
    }
}

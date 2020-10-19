package com.company;

public class Calculation {

    private Calculation(){
    }

    public static double calculate(double firstArgument, String operation, double secondArgument) {
        double result = 0;
        switch (operation){
            case "+":
                result = summation(firstArgument, secondArgument);
                break;
            case "-":
                result = subtraction(firstArgument, secondArgument);
                break;
            case "*":
                result = multiplication(firstArgument,secondArgument);
                break;
            case "/":
                result = separate(firstArgument, secondArgument);
                break;
        }
        return result;
    }


    private static double summation(double firstArgument, double secondArgument) {
        return firstArgument + secondArgument;
    }

    private static double subtraction(double firstArgument, double secondArgument) {
        return firstArgument - secondArgument;
    }

    private static double multiplication(double firstArgument, double secondArgument) {
        return firstArgument * secondArgument;
    }

    private static double separate(double firstArgument, double secondArgument) {
        return firstArgument / secondArgument;
    }
}
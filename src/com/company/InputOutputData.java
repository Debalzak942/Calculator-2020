package com.company;

import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputOutputData {

    private String arithmetic;
    private double inputFirstNumber;
    private double inputSecondNumber;

    public InputData enterData() throws InputMismatchException, ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первый агрумент: ");
            inputFirstNumber = scanner.nextDouble();
            System.out.println("Введите арифметическую операцию: ");
            arithmetic = scanner.next();
            if (!arithmetic.equals("*")
                    && !arithmetic.equals("/")
                    && !arithmetic.equals("+")
                    && !arithmetic.equals("-")) {
                throw new ArithmeticException();
            }
            System.out.println("Введите второй аргумент: ");
            inputSecondNumber = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Нужно ввести число!");
            System.exit(0);
        } catch (ArithmeticException arithmeticException) {
            System.err.println("Нужно ввести арифметическую операцию: *, /, +, -");
            System.exit(0);
        }
        return new InputData(inputFirstNumber, arithmetic, inputSecondNumber);
    }

    public void outputData(double result) {
        System.out.println(result);
    }
}

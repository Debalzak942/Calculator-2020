package com.company;

public class InputData {

    private final double firstNumber;
    private final String arithmetic;
    private final double secondNumber;

    public InputData (double firstNumber, String arithmetic, double secondNumber) {
        this.firstNumber = firstNumber;
        this.arithmetic = arithmetic;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public String getArithmetic() {
        return arithmetic;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
}

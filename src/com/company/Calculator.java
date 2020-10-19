package com.company;

public class Calculator {

    public static void main(String[] args) {
        InputOutputData inputOutputData = new InputOutputData();
        InputData inputData = inputOutputData.enterData();
        double result = Calculation.calculate(inputData.getFirstNumber(),
                inputData.getArithmetic(),
                inputData.getSecondNumber());
        inputOutputData.outputData(result);
    }
}

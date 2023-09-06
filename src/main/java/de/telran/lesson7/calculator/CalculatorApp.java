package de.telran.lesson7.calculator;

import lesson7.calculator.service.Calculator;
import lesson7.calculator.userInretface.UserInput;
import lesson7.calculator.userInretface.UserOutput;

public class CalculatorApp {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        UserOutput userOutput = new UserOutput();
        Calculator calc = new Calculator();

        System.out.println("Добавьте первое значение: ");
        double firstValue = userInput.UserInputDouble();

        System.out.println("Добавьте второе значение: ");
        double secondValue = userInput.UserInputDouble();

        userOutput.printData("Результат сложения " + firstValue + " и " + secondValue + ": ",
        calc.add(firstValue, secondValue));

        userOutput.printData("Результат вычитания " + firstValue + " и " + secondValue + ": ",
        calc.subtract(firstValue, secondValue));

        userOutput.printData("Результат умножения " + firstValue + " и " + secondValue + ": ",
        calc.multiply(firstValue, secondValue));

        userOutput.printData("Результат деления " + firstValue + " и " + secondValue + ": ",
        calc.divide(firstValue, secondValue));
    }
}

package de.telran.lesson7.calculator.userInretface;

import java.util.Scanner;

public class UserInput {
//    ввод данных от пользователя
    public double UserInputDouble() {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextInt();
        return input;
    }
}

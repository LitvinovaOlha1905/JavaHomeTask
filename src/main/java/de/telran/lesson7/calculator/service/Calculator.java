package de.telran.lesson7.calculator.service;

public class Calculator {
    //====== add - сложение
    public double add(double x, double y){
        double result = x + y;
        return result;
    }

    //====== subtract - вычитание
    public double subtract(double x, double y){
        double result = x -y;
        return result;
    }

    //====== multiply - умножение
    public double multiply(double x, double y){
        double result = x * y;
        return result;
    }

    //====== divide - деление
    public double divide(double x, double y){
        double result = x / y;
        return result;
    }
}

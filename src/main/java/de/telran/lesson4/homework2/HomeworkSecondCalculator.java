package de.telran.lesson4.homework2;

public class HomeworkSecondCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.x = 442;
        calc.y = 163;

        System.out.println("Результат сложения: " + calc.add());
        System.out.println("Результат деления: " + calc.sub());
        System.out.println("Результат умножения: " + calc.mult());
        System.out.println("Результат деления: " + calc.div());
    }
}

package de.telran.lesson7.currencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в евро: ");
        double euroAmount = scanner.nextDouble();

        // Указать текущий обменный курс
        double exchangeRate = 1.07; // Актуальный курс

        double dollarAmount = convertEuroToDollar(euroAmount, exchangeRate);

        System.out.println(euroAmount + " евро равны " + dollarAmount + " долларам США.");
    }

    public static double convertEuroToDollar(double euroAmount, double exchangeRate) {
        if (euroAmount < 0 || exchangeRate <= 0) {
            throw new IllegalArgumentException("Сумма и обменный курс должны быть положительными числами.");
        }

        double dollarAmount = euroAmount * exchangeRate;
        return dollarAmount;
    }
}




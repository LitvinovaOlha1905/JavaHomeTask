package de.telran.lesson19.task6;

import java.util.Scanner;
public class task6 {
    /*
    Напишите программу, которая определит, сколько слов Вы ввели с консоли.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов во введенной строке: " + wordCount);

        scanner.close();
    }

    // Метод для подсчета слов в строке
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
}

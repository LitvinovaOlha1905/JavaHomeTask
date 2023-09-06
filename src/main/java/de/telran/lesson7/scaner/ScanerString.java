package de.telran.lesson7.scaner;

import java.util.Scanner;

public class ScanerString {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);

        //Создаь запрос на ввод первого слова

        System.out.println("Введите первое слово: ");
        String firstWord = scannerString.next();

        //Создаь запрос на ввод второго слова

        System.out.println("Введите второе слово: ");
        String secondWord = scannerString.next();

        //Обрезать часть первого слова

        String subStringFirstWord = firstWord.substring(2);
        System.out.println("Результат: " + subStringFirstWord);

        //Обрезать часть вторго слова
        String subStringSecondWord = secondWord.substring(2);
        System.out.println("Результат: " + subStringSecondWord);

        //Склеить две части первого и второго слова в одно слово

        String newStringWord = subStringFirstWord + subStringSecondWord;
        System.out.println("Полученное словов в результате слияния: " + newStringWord);

    }
}

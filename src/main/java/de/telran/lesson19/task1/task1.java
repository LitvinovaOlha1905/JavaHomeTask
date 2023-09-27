package de.telran.lesson19.task1;

public class task1 {
/*
Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
*/


    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        for (String element : arr) {
            System.out.print(element + " ");
        }

        // Меняем местами элементы в массиве в обратном порядке
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }

        // Вывод массива после замены элементов
        System.out.println("\nМассив после замены элементов в обратном порядке:");
        for (String element : arr) {
            System.out.print(element + " ");
        }

    }
}



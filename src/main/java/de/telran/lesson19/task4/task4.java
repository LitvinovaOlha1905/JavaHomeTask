package de.telran.lesson19.task4;

import java.util.Random;
public class task4 {

    /*
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]
 Выведите массив на экран в строку
 Замените каждый элемент с нечётным индексом на ноль
 Снова выведете массив на экран на отдельной строке
    */

    public static void main(String[] args) {
        // Создаем массив из 8 случайных целых чисел из отрезка [1;10]
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }

        // Выводим исходный массив на экран в строку
        System.out.print("Исходный массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Заменяем каждый элемент с нечётным индексом на ноль
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }

        // Выводим измененный массив на экран на отдельной строке
        System.out.print("Измененный массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переходим на новую строку
    }
}

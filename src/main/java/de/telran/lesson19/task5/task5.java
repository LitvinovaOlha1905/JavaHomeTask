package de.telran.lesson19.task5;

import java.util.Random;
public class task5 {

    /*
    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
 Выведите массивы на экран в двух отдельных строках
 Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
    */

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // Заполняем массивы случайными целыми числами из отрезка [0;5]
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(6); // Генерируем числа от 0 до 5
            array2[i] = random.nextInt(6);
        }

        // Выводим массивы на экран
        System.out.print("Массив 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.print("Массив 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Вычисляем средние арифметические
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);

        // Сравниваем средние арифметические и выводим результат
        if (average1 > average2) {
            System.out.println("Среднее арифметическое элементов массива 1 больше.");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое элементов массива 2 больше.");
        } else {
            System.out.println("Средние арифметические элементов массивов равны.");
        }
    }

    // Метод для вычисления среднего арифметического элементов массива
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}

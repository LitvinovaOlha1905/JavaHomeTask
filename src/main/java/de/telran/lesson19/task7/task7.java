package de.telran.lesson19.task7;

import java.util.Arrays;
import java.util.Random;

public class task7 {
    /*
    Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли
массив строго возрастающей последовательностью (каждый элемент строго больше предыдущего)
    */
    public static void main(String[] args) {
        // Создаем массив из 5 случайных целых чисел в интервале [10, 99]
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем случайное число от 10 до 99
        }

        // Выводим массив на консоль в строку
        System.out.println("Массив: " + Arrays.toString(array));

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим результат проверки на экран
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

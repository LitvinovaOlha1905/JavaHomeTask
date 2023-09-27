package de.telran.lesson19.task2;

import java.util.Random;
import java.util.Scanner;

public class task2 {
    /*
    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
 Введенное пользователем число сохраняется в переменную n.
 Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 3): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Пожалуйста, введите целое число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 3);

        int[] array = new int[n];
        Random random = new Random();

        System.out.print("Массив из случайных чисел: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Массив из четных элементов: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

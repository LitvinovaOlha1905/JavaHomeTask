package de.telran.lesson19.task3;

import java.util.Random;
public class task3 {

    /*
    Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
  Определите какой элемент является в этом массиве максимальным и
  сообщите индекс его последнего вхождения в массив.
    */
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();

        // Заполняем массив случайными целыми числами из интервала [-15, 15]
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15; // Генерируем от -15 до 15
        }

        // Находим максимальный элемент и индекс его последнего вхождения
        int maxElement = array[0];
        int lastIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] >= maxElement) {
                maxElement = array[i];
                lastIndex = i;
            }
        }

        // Выводим результаты
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Индекс последнего вхождения максимального элемента: " + lastIndex);
    }

}

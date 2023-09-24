package de.telran.lesson17.homework.task1;

import java.util.Arrays;
import java.util.Random;

public class ArrayTaskFirst {
    /*
    Создайте массив из 8 случайных целых чисел из интервала [1;50]
    Выведите массив на консоль в строку.
    Замените каждый элемент с нечетным индексом на ноль.
    Снова выведете массив на консоль в отдельной строке.
    */
    public static void main(String[] args) {
        // Создаем рандом
        Random randomArr = new Random();

        int arraySize = 8;
        int countEven = 0;

        // Создаем массив
        int[] intArray = new int[arraySize];
        
        System.out.println("Массив: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomArr.nextInt(51);
            System.out.print(intArray[i]+ ", ");
        }

        System.out.println();
        System.out.println(Arrays.toString(intArray));

        // Используем цикл для замены нечетных элементов на 0
        for (int i = 0; i < intArray.length; i++) {

            //Если элемент нечетный, заменяем его на 0.
            if(i % 2 !=0){                  //проверяем нечетность элемента
                intArray[i] = countEven;    // Заменяем нечетный элемент на 0
            }
            System.out.print(intArray[i]+ ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(intArray));
    }
}

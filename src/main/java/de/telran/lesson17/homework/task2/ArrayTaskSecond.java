package de.telran.lesson17.homework.task2;

import java.util.Arrays;
import java.util.Random;

public class ArrayTaskSecond {
    /*
    Создайте массив из 5 случайных целых чисел из интервала [10;99]
    Выведите его на консоль в строку.

    Определите и выведите на экран сообщение о том, является ли
    массив строго возрастающей последовательностью.
    */

    public static void main(String[] args) {
        Random randomArr = new Random();

        int arraySize = 5;
        boolean isIncreasing = true;

        int[] intArray = new int[arraySize];

        System.out.println("Массив: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomArr.nextInt(10,100);
            System.out.print(intArray[i] + ", ");
        }
        System.out.println();
        System.out.print(Arrays.toString(intArray));

        for (int i = 1; i < intArray.length; i++) {
           if(intArray[i] <= intArray[i - 1]){
               isIncreasing = false;
               break;
           }
        }

        System.out.println();
        if (isIncreasing){
            System.out.println("Массив является строго возрастающей последовательностью");
        }else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}

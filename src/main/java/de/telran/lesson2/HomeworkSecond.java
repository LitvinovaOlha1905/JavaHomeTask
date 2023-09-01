package de.telran.lesson2;

public class HomeworkSecond {
    public static void main(String[] args) {

//   Дано трехзначное число. Вывести на экран все цифры этого числа, которые вы должны получить в результате
//   математических действий над этим числом.  Пример: 345 Вывод в консоль: Число 345 -> 3, 4, 5)

        int a = 345;
        int x = a / 100;
        int c = a % 100 / 10;
        int e = a % 10;

        System.out.println("Число " + a + " -> " + x + ", " + c + ", " + e);
    }
}

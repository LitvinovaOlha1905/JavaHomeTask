package de.telran.lesson9.temperature;

import java.util.Random;

public class Temperature {
     /*
        Представим, что у нас есть устройство, в котором две колбы.
        Прибор работает корректно, если температура первой колбы выше 100 градусов,
        а температура второй колбы меньше 100 градусов.
        Вы должны написать метод, который проверяет это устройство.
        Ваша программа должна иметь переменные Temperature1 и Temperature2.
        В результате он выводит сообщение true или false.
     */
    public static void main(String[] args) {

        Random temperature1 = new Random();
        Random temperature2 = new Random();

        int RandomTemperature1 = temperature1.nextInt(50, 150);
        System.out.println("Температура на термометре: " + RandomTemperature1);

        int RandomTemperature2 = temperature2.nextInt(50, 90);
        System.out.println("Температура на термометре: " + RandomTemperature2);

        boolean result = checkDevice(RandomTemperature1, RandomTemperature2);
        System.out.println(result);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}

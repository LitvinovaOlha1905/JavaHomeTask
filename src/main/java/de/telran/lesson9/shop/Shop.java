package de.telran.lesson9.shop;

public class Shop {
    public static void main(String[] args) {
       /* Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того,
          открыты магазины или нет (значения задайте сами).
        * Реализуйте логический метод canBuy, возвращающий true / false.
          Значение этой переменной должно быть true, если хотя бы один
          магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.*/

        boolean isEdekaOpen = true;  // Edeka открыт
        boolean isReweOpen = false; // Rewe закрыт

        boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);

        String message = "Я могу купить еду, это " + canBuy;
        System.out.println(message);
    }

    public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen || isReweOpen) {
            return true; // Если хотя бы один магазин открыт, то можно купить еду
        } else {
            return false; // Если оба магазина закрыты, то нельзя купить еду
        }
    }
}

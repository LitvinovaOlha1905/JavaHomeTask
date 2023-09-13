package de.telran.lesson9.calories;

public class Calories {
    /*
       Напишите программу, которая вычисляет, сколько лишних калорий будет,
       если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
       Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
    */
    public static void main(String[] args) {

        // блок получения данных от пользователя
        UserInputPizza UserInputPizza = new UserInputPizza();
        System.out.println("Введите диаметр первой пиццы: ");
        double diameterPizza1 = UserInputPizza.UserInputPizza();

        System.out.println("Введите диаметр второй пиццы: ");
        double diameterPizza2 = UserInputPizza.UserInputPizza();

        // определяем площадь пиццы
        double radiusPizza1 = diameterPizza1 / 2;
        double areaPizza1 = 3.1415 * (radiusPizza1 * radiusPizza1);

        double radiusPizza2 = diameterPizza2 / 2;
        double areaPizza2 = 3.1415 * (radiusPizza2 * radiusPizza2);

        // определяем сколько калорий в пицце диаметром 24см
        double caloriesInQuarterSmInPizza1 = 40;
        double caloriesInPizza1 = areaPizza1 * caloriesInQuarterSmInPizza1;
        System.out.println("Количество калорий в пицце диаметром " + diameterPizza1 + ": " + caloriesInPizza1);

        double caloriesInQuarterSmInPizza2 = 40;
        double caloriesInPizza2 = areaPizza2 * caloriesInQuarterSmInPizza2;
        System.out.println("Количество калорий в пицце диаметром " + diameterPizza2 + ": " + caloriesInPizza2);

        // определяем разницу между пиццами в калориях
        double differenceInCalories = caloriesInPizza2 - caloriesInPizza1;
        System.out.println("Разница калорий между пиццами: " + differenceInCalories);


    }


}

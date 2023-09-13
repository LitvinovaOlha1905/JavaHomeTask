package de.telran.lesson9.weather;

public class Weather {
    public static void main(String[] args) {
// Создайте две переменные isWeekend и isRain.
// Дайте им свои произвольные значения

        boolean isWeekend = true;
        boolean isRain = false;

// Создайте переменную canWalk, значение которой должно быть истинным,
// если это выходной день (isWeekend=true) и не идет дождь (isRain=false).

        boolean canWalk = true;

        if (isWeekend && !isRain) {
            System.out.println("На улице нет дождя, можно прогуляться.");
        } else {
            System.out.println("На улице дождь, лучше остаться дома.");
        }
    }
}

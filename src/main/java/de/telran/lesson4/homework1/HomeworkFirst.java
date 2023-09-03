package de.telran.lesson4.homework1;

public class HomeworkFirst {
    public static void main(String[] args) {
        // Создаем строку через new
        String myString = new String("I study Basic Java!");

        // Вызываем метод, передавая в него созданную строку
        processString(myString);

        // Выводим пред-последний символ строки
        char secondToLastChar = myString.charAt(myString.length() - 2);
        System.out.println("Пред-последний символ строки: " + secondToLastChar);

        // Проверяем, содержит ли строка подстроку "Java"
        boolean containsJava = myString.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        // Вырезаем подстроку "Java"
        String withoutJava = myString.substring(14, 18);
        System.out.println("Строка без 'Java': " + withoutJava);

        // Заменяем все символы "а" на "о"
        String replacedString = myString.replace("a", "o");
        System.out.println("Строка после замены: " + replacedString);

        // Преобразуем строку к верхнему регистру
        String uppercaseString = myString.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + uppercaseString);

        // Преобразуем строку к нижнему регистру
        String lowercaseString = myString.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowercaseString);
    }

    public static void processString(String inputString) {
        // Метод для обработки строки
        System.out.println("Обработка строки: " + inputString);
    }
}

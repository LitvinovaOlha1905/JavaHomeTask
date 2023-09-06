package de.telran.lesson7.workingWithString;

public class WorkingWithString {
    public static void main(String[] args) {
//Создайте строку через new - I study Basic Java!
        String str = new String("I study Basic Java!");

//Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        processString(str);

//Распечатать последний символ строки. Используем метод String.charAt().

        char strChar = str.charAt(str.length()-1);
        System.out.println("Последний символ: " + strChar);

//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        boolean containsJava = str.contains("Java");
        System.out.println("Есть ли слово 'Java': " + containsJava);

//Заменить все символы “а” на “о”.

        String replacedeString = str.replace("a", "o");
        System.out.println("Результат замены букв: " + replacedeString);

//Преобразуйте строку к верхнему регистру.

        String toUpperCaseString = str.toUpperCase();
        System.out.println("Результат: " + toUpperCaseString);

//Преобразуйте строку к нижнему регистру.
        String toLowerCaseString = str.toLowerCase();
        System.out.println("Результат: " + toLowerCaseString);

//Вырезать строку Java c помощью метода String.substring().
        String subString = str.substring(14, 18);
        System.out.println("Результат: " + subString);

    }

    //метод для обработки строки

    public static void processString(String inputString){
        System.out.println("Обработка строки: " + inputString);
    }
}

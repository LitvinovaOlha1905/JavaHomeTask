package de.telran.lesson7.calculator.userInretface;

public class UserOutput {

    public void printData(String message, Double dataForPrinting) {
        System.out.println(message);
        System.out.println(" -> " + dataForPrinting);
    }
}

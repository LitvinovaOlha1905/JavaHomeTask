package de.telran.lesson7.systemOfCalculus;

public class SystemOfCalculus {
    public static void main(String[] args) {
//  Перевод числа 333 из 16-ричной в 10-ричную систему:
        String hexNumber = "333";
        int decimalNumber = Integer.parseInt(hexNumber, 16);
        System.out.println("Число в 10-ричной системе: " + decimalNumber);

//  Перевод числа 819 из 10-ричной в 16-ричную систему:
        int decimalNumber2 = 819;
        String hexNumber2 = Integer.toHexString(decimalNumber2);
        System.out.println("Число в 16-ричной системе: " + hexNumber2);

//  Перевод числа 101101 из двоичной в 10-ричную систему:
        String binaryNumber = "101101";
        int decimalNumber3 = Integer.parseInt(binaryNumber, 2);
        System.out.println("Число в 10-ричной системе: " + decimalNumber3);

//  Перевод числа 124 из 10-ричной в двоичную систему:
        int decimalNumber4 = 124;
        String binaryNumber2 = Integer.toBinaryString(decimalNumber4);
        System.out.println("Число в 2-ичной системе: " + binaryNumber2);

    }
}

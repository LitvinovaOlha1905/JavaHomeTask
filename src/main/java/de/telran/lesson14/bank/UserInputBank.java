package de.telran.lesson14.bank;

import java.util.Scanner;

public class UserInputBank {

    public int userInputBank(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму на счету: ");
        int amountOnAccount = scanner.nextInt();
        return amountOnAccount;
    }
}

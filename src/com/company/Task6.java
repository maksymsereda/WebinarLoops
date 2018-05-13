package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int secretNumber = 600;
        int userNumber;
        Scanner scanner =new Scanner(System.in);

        do {
            System.out.println("Write a number");
            userNumber = scanner.nextInt();

        }while (secretNumber != userNumber);

        System.out.println("Correct number was given");

    }
}

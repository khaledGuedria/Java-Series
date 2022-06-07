/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice4 {

    //var
    //method
    public static void enversNumber() {

        Scanner mScanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number :");
            int value = mScanner.nextInt();
            String str = String.valueOf(value);
            String finalStr = "";
            int i = str.length() - 1;

            if (value < 0) {
                System.out.println("The entered value must be positive!");
            } else {
                do {
                    finalStr = finalStr + str.charAt(i);
                    i--;
                } while (i >= 0);

                System.out.println("The reverse number is " + finalStr);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, The entered value has to be a number! Try again.");
        }

    }
}

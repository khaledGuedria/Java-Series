/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice5 {

    public static void sommeCarre() {

        Scanner mScanner = new Scanner(System.in);  // Create a Scanner object

        try {
            System.out.println("Enter a number between 1 and 999");
            int number = mScanner.nextInt();

            if (number >= 1 && number <= 999) {

                int sum = 0;
                String str = String.valueOf(number);
                for (int i = 0; i < str.chars().count(); i++) {

                    sum += Character.getNumericValue(str.charAt(i));

                }

                if (sum % 2 == 0) {
                    System.out.println("Final result = " + Math.pow(sum, 2));
                } else {
                    System.out.println("Final result = " + Math.sqrt(sum));
                }

            } else {
                System.out.println("Invalid number! Enter a number between 1 and 999");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch, entered value must be a number! Try again.");
        }

    }

}

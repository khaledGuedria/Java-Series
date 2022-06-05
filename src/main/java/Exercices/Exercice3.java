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
public class Exercice3 {

    //var
    public static void montantAPayer() {

        Scanner mScanner = new Scanner(System.in);  // Create a Scanner object

        try {
            System.out.println("Enter the starting hour :");
            int h1 = mScanner.nextInt();

            System.out.println("Enter the ending hour :");
            int h2 = mScanner.nextInt();
            if (h2 == 0) {
                h2 = 24;
            } else if (h1 < 18) {
                System.out.println("Sorry We are working only on night shift! starting hour must be greater than 18H");
            }
            if (h1 < h2) {

                //case 1 : h1 & h2 in the first shift [19 - 21]
                if (h1 >= 18 && h2 <= 21) {
                    double result = (h2 - h1) * 1.5;
                    System.out.println("The result price = " + result);
                } //case 2 : h1 & h2 in the second shift [21 - 23]
                else if (h1 >= 21 && h2 <= 24) {
                    double result = (h2 - h1) * 4.5;
                    System.out.println("The result price = " + result);
                } //case 3 : h1 in the first shift and h2 in the second shift [19 - 23]
                else if ((h1 >= 18 && h1 <= 21) && (h2 > 21 && h2 <= 24)) {
                    double result = (21 - h1) * 1.5 + (h2 - 21) * 4.5;
                    System.out.println("The result price = " + result);
                }

            } else {
                System.out.println("Invalid Input, Ending hour must be greater than Starting hour!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch! Try again.");
        }

    }

}

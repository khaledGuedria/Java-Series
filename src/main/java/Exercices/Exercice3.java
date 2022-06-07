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
    static boolean isPremier = true;

    //method
    public static void nombrePremier() {

        Scanner mScanner = new Scanner(System.in);

        try {

            System.out.println("Enter a number :");
            int value = mScanner.nextInt();
            int i = value - 1;

            while (i > 1) {
                if (value % i == 0) {

                    isPremier = false;
                    break;
                }
                i--;
            }

            String msg = ((isPremier == true) ? value + " est un nombre premier" : value + " n'est pas un nombre premier!");
            System.out.println(msg);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, the entered value has to be a number! Try again.");
        }

    }
}

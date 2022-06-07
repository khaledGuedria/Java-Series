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
public class Exercice1 {

    //var
    static int fact = 0;

    public static void Calculfactorielle() {

        Scanner mScanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        try {

            int value = mScanner.nextInt();
            fact = factorielle(value);
            System.out.println("Result = " + fact);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, the entered value has to be a number! Try again.");
        }

    }

    public static int factorielle(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorielle(n - 1);

    }

}

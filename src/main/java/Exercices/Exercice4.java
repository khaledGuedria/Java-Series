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

    public static void totalAPayer() {

        Scanner mScanner = new Scanner(System.in);  // Create a Scanner object
        try {
            System.out.println("Enter the inital total amount to pay :");
            double total = mScanner.nextDouble();

            //conditions
            if (total > 0 && total <= 20) {
                System.out.println("No discount assigned! Total amount to pay still the same [ "+ total+" ]");
                
            } else if (total > 20 && total <= 100) {
                System.out.println("5% discount assigned! Total amount to pay = "+ (total - (total*5)/100));

            } else if (total > 100 && total <= 200) {
                System.out.println("10% discount assigned! Total amount to pay = "+ (total - (total*10)/100));
                
            } else if (total > 200) {
                System.out.println("15% discount assigned! Total amount to pay = "+ (total - (total*15)/100));
            } else {
                System.out.println("Total amount cannot be negative value!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch! Try again.");
        }
    }
}

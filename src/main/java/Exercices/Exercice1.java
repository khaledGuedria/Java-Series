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
    //Method
    public static void AfficherMention() {

        Scanner mScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your Grade");

        while (mScanner.hasNext()) {
            try {

                double grade = mScanner.nextDouble();  // Read user input
                if (grade > 0 && grade <= 20) {

                    if (grade < 10) {
                        System.out.println("Redouble");
                    } else if (grade >= 10 && grade < 12) {
                        System.out.println("Passable");
                    } else if (grade >= 12 && grade < 14) {
                        System.out.println("Assez bien");
                    } else if (grade >= 14 && grade < 16) {
                        System.out.println("Bien");
                    } else if (grade >= 16 && grade <= 20) {
                        System.out.println("Trés bien");
                    }

                } else {
                    System.out.println("Grade must be between 0 and 20! try again.");
                }

            } catch (InputMismatchException ex) {

                System.out.println("Invalid input, Grade must be a number! try again.");
                break;
            }
        }

    }

}

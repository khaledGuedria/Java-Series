/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice2 {

    //var
    static List<Integer> pairs = new ArrayList<>();

    public static void trouverPaire() {

        Scanner mScanner = new Scanner(System.in);

        try {

            System.out.println("Enter a minimum value :");
            int n1 = mScanner.nextInt();
            System.out.println("Enter a Maximum value :");
            int n2 = mScanner.nextInt();

            for (int i = n1; i <= n2; i++) {
                if (i % 2 == 0) {
                    pairs.add(i);
                }
            }

            //result
            System.out.println("Pair numbers = " + pairs);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, the entred value has to be a number! Try again.");
        }

    }

}

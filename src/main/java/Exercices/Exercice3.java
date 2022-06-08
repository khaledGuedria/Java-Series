/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import static Exercices.Exercice1.addItem;
import static Exercices.Exercice1.integers;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice3 {

    //var
    static int positiveNum = 0;
    static int prod = 1;

    public static void calculProduit() {
        //var
        int[] array = enterNumbers();

        for (int i = 0; i < array.length; i++) {
            //calculate multiplication
            prod = prod * array[i];
            //check positive values
            if (array[i] > 0) {
                positiveNum++;
            }
        }

        //prompt
        System.out.println(
                "Calculating ...");
        System.out.println(
                "-------------------------");
        System.out.println(
                "Multiplication = " + prod);
        System.out.println(
                "-------------------------");
        System.out.println(
                "Positive values number = " + positiveNum);
        System.out.println(
                "-------------------------");

    }

    //saisie des entiers
    public static int[] enterNumbers() {

        Scanner mScanner = new Scanner(System.in);
        System.out.println("Enter a number :");

        //while (mScanner.hasNext()) {
        while (integers.length < 10) {

            System.out.println("----------------------------------");
            System.out.println("Enter another number :");

            try {
                //input
                int value = mScanner.nextInt();
                //add to tab
                if (value != 0) {
                    integers = addItem(integers.length, integers, value);
                } else {
                    System.out.println("Invalid Input, the entered value must non-zero number! try again.");
                }

                //prompt
                System.out.println(Arrays.toString(integers));

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, the entered value must be a number! try again.");
            }
        }

        //mScanner.close();
        return integers;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice1 {

    //var
    static int[] integers = new int[0];

    public static int[] saisirTableau() {

        Scanner mScanner = new Scanner(System.in);
        System.out.println("Enter a positive value :");

        //while (mScanner.hasNext()) {
        while (integers.length < 11) {
            try {

                int value = mScanner.nextInt();

                if (value >= 0) {
                    integers = addItem(integers.length, integers, value);
                } else {
                    System.out.println("Invalid Input, the entered value must be a positive number! try again.");
                }

                //prompt
                System.out.println(Arrays.toString(integers));
                System.out.println("----------------------------------");
                System.out.println("Enter another positive value :");

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input, the entered value must be a number! try again.");
            }
        }

        return integers;

    }

    //add element
    // Function to add item in arr
    public static int[] addItem(int n, int arr[], int x) {
        int i;

        // create a new array of lenght n+1
        int newarr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }

        newarr[n] = x;

        return newarr;
    }
}

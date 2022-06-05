/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice6 {

    //var
    static String[] months = new DateFormatSymbols().getMonths();
    static int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void getDate() {
        Scanner mScanner = new Scanner(System.in);  // Create a Scanner object
        try {

            System.out.println("Enter a day");
            int DD = mScanner.nextInt();

            System.out.println("Enter a month");
            int MM = mScanner.nextInt();

            System.out.println("Enter a year");
            int YYYY = mScanner.nextInt();

            //année bissextile check
            if ((YYYY % 4 == 0 && YYYY % 100 != 0) || YYYY % 400 == 0) {
                monthDays[1] = 27;
            }

            //Result
            System.out.println(DD + " " + months[MM - 1] + " " + YYYY);
            System.out.println("Il reste seulement " + (monthDays[MM - 1] - DD) + " jours avant la fin du mois");

        } catch (InputMismatchException e) {
            System.out.println("Input mismatch, Values must be numbers! Try again.");
        }
    }
}

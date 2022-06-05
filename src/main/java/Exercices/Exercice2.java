/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import java.util.InputMismatchException;
import java.util.Scanner;
import jdk.nashorn.api.tree.BreakTree;

/**
 *
 * @author khaledguedria
 */
public class Exercice2 {

    //var 
    static int a = 0;
    static int b = 0;
    static String operation = "";

    public static void operationArithmetique() {

        try {

            Scanner mScanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter a number");

            a = mScanner.nextInt();

            System.out.println("Enter a second number");

            b = mScanner.nextInt();

            System.out.println("Enter an operation symbol [+, *, -, /, %]");

            operation = mScanner.next();

            switch (operation) {
                case "+":
                    System.out.println("Result : " + (a + b));
                    break;
                case "-":
                    System.out.println("Result : " + (a - b));
                    break;
                case "*":
                    System.out.println("Result : " + (a * b));
                    break;
                case "/":
                    System.out.println("Result : " + (a / b));
                    break;
                case "%":
                    System.out.println("Result : " + (a % b));
                    break;
                default:
                    System.out.println("Invalid arithmetic operator!");
                    break;
            }

//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(operation);
        } catch (InputMismatchException e) {

            System.out.println("Values mismatching! Try again.");

        }

    }
}

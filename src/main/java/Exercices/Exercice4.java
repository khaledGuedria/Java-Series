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
public class Exercice4 {
        
    
    //1
    public static void chercheEntier(){
        
        //var
        int[] array = Exercice3.enterNumbers();
        Scanner mScanner = new Scanner(System.in);
        boolean isFounded = false;
        
        //processing
        try {
            
            //searched value
            System.out.println("-----------------------------------");
            System.out.println("Tap the the desired value :");
            int value = mScanner.nextInt();
            
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    isFounded = true;
                    System.out.println("-----------------------------------");
                    System.out.println("[code 0] The searched value "+ value +" has been founded at position " + i);
                }
            }
            
            if(!isFounded){
                System.out.println("-----------------------------------");
                System.out.println("[code -1] The searched value cannot be founded!");
            }
            
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, the entered value must be a number! try again.");
        }
    }
    
    //2
    public static void triTableau(){
     
        //var
        int[] array = Exercice3.enterNumbers();
        Arrays.sort(array);
        System.out.println("-------------------------------");
        System.out.println("Sorted Arrays = " + Arrays.toString(array));
    }
}

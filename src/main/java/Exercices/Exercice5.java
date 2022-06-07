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
public class Exercice5 {

    //var
    static int i = 1;
    static double earned = 0;
    
    
    public static void planEpargne() {

        Scanner mScanner = new Scanner(System.in);
        try {

            //Inputs
            System.out.println("Quel est votre capital de départ ?");
            double capital = mScanner.nextDouble();
            System.out.println("Quel est votre montant de dépôt annuel ?");
            double depot = mScanner.nextDouble();
            System.out.println("Quel est votre taux d'intérêt annuel en % (maximum 15%)");
            double interet = mScanner.nextDouble();
            System.out.println("Quel est votre seuil de richesse voulu ?");
            double seuil = mScanner.nextDouble();
            System.out.println("");
            double depart = capital + depot;
            //Verification
            
            System.out.println("Montant de dépôt annuel : " + depot + " $");
            System.out.println("taux d'intérêt annuel (Suppose fixe) : " + interet + "%");
            System.out.println("");
            //Evolution
            System.out.println("");
            System.out.println("Evolution du plan d'epargne :");
            System.out.println("");
            System.out.println("Annee       Capital         Taux        Value");
            do {                
                //depart += depot;
                earned = (depart+depart*interet/100);
                System.out.println(i + "       "+ depart +"         "+ depart*interet/100 +"        " + earned);
                depart += depot;
                i++;
            } while (earned<=seuil);
            
            
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, the entred value has to be a number! Try again.");
        }
    }
}

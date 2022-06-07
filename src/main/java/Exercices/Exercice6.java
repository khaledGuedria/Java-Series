/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

import static Exercices.Exercice5.earned;
import static Exercices.Exercice5.i;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author khaledguedria
 */
public class Exercice6 {

    //var
    static String[] plats = {"Pizza", "Plat Escalope", "Plat Poulet", "Plat Grillade"};
    int i = 1;
    
    public static void voirMenu() {

        Scanner mScanner = new Scanner(System.in);
        try {

            //Inputs
            System.out.println("Bienvenue chez nous! Voici notre Menu");
            System.out.println("");
            for (String plat : plats) {
                System.out.println(Arrays.asList(plats).indexOf(plat)+ "- " + plat);
            }
            System.out.println("");
            //Verification

            System.out.println("Quel plat voulez vous commander ? Veuillez saisir l'index du plat.");
            int value = mScanner.nextInt();
            System.out.println("");
            System.out.println("Commande validée! Installez vous, votre " + plats[value] + " est deja en route!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input, the entred value has to be a number! Try again.");
        }

    }

}

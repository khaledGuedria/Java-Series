/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercices;

/**
 *
 * @author khaledguedria
 */
public class Exercice2 {

    public static void findMinMaxAvg() {

        //var
        int[] array = Exercice1.saisirTableau();
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;
        double sum = array[0];

        //calculating
        for (int i = 1; i < array.length; i++) {
            //min
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
            //max
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
            //sum
            sum += array[i];
        }

        //Prompt
        System.out.println(
                "Calculating ...");
        System.out.println(
                "-------------------------");
        System.out.println(
                "Minimum = " + min + " at index " + minIndex);
        System.out.println(
                "-------------------------");
        System.out.println(
                "Maximum = " + max + " at index " + maxIndex);
        System.out.println(
                "-------------------------");
        System.out.println(
                "Average = " + (sum / array.length));

    }
}

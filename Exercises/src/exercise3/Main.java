/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

import static exercise3.Array.bubble;
import static exercise3.Array.quicksort;
import java.util.Arrays;
import java.util.Scanner;

/**
 * La clase Main permite al usuario elegir el tipo de ordenamiento para un array aleatorio.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        for(int position = 0; position < array.length; position++)
            array[position] = (int)(Math.random()*20)+1;
        System.out.println(Arrays.toString(array));
        
        try {
        System.out.println("""
                           Digite el número correspondiente a la forma deseada de ordenar el arreglo.
                           1. Algoritmo de burbuja
                           2. Quicksort""");
        int order = Integer.parseInt(s.nextLine());
            if (order == 1){
                quicksort(array, 0, array.length - 1);
                System.out.println(Arrays.toString(array));
            }else{
                bubble(array);
                System.out.println(Arrays.toString(array));
            }   
        } catch (NumberFormatException e) {
            System.out.println("Error: Se ha recibido un caracter no numerico");
        } 
    }
}

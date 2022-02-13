/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

import static exercise3.Array.bubble;
import static exercise3.Array.quicksort;
import java.util.Arrays;

/**
 *
 * @author lcast
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        for(int position = 0; position < array.length; position++)
            array[position] = (int)(Math.random()*20)+1;
        System.out.println(Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        bubble(array);
        System.out.println(Arrays.toString(array));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;


/**
 *
 * @author lcast
 */
public class Array {
    
    public static void bubble(int[] array) {
        int i, j, aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
}
    
    private static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        while (true) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left >= right) {
                return right;
            } else {
                int temporal = array[left];
                array[left] = array[right];
                array[right] = temporal;
                left++;
                right--;
            }
        }
    }
    
    public static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quicksort(array, left, partitionIndex);
            quicksort(array, partitionIndex + 1, right);
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;


/**
 * La clase Array contiene dos métodos para ordenar un arreglo.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Array {
    
    /**
     * El método bubble permite ordenar un arreglo mediante el algoritmo de la burbuja.
     * 
     * @param array 
     * 
     * @author Lorena Castro - Lcastro0398@gmail.com
     * 
     * @since 1.00.000
     */
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
    
    /**
     * El método partition es fundamental para el algoritmo quicksort ya que indica de dónde partir para dividir el arreglo.
     * @param array
     * @param left
     * @param right
     * @return 
     * 
     * @author Lorena Castro - Lcastro0398@gmail.com
     * 
     * @since 1.00.000
     */
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
    
    /**
     * El método quicksort permite ordenar un arreglo mediante el algoritmo quicksort.
     * 
     * @param array
     * @param left
     * @param right 
     * 
     * @author Lorena Castro - Lcastro0398@gmail.com
     * 
     * @since 1.00.000
     */
    public static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quicksort(array, left, partitionIndex);
            quicksort(array, partitionIndex + 1, right);
        }
    }
}

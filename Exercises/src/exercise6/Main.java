/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * La clase Main contiene el método para iniciar el programa.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Main {
    /**
     * Permite la interacción con el usuario para que este escoja la forma de ordenar el vector.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        
        try{
        int num = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Por favor digite el número que desea agregar al array:");
            num = Integer.parseInt(s.nextLine());
            v.addElement(num);
            
        } while ((v.size() == 1) || (num != v.elementAt(v.size()-2)));
            System.out.println(v);
        }
        
        catch (NumberFormatException e){
            System.out.println("Error: Se ha recibido un caracter no numerico");
        }
        
        finally{
            System.out.println(v);}
    } 
             
}

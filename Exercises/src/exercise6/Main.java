/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise6;

import java.util.Scanner;
import java.util.Vector;

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
        Vector<Integer> v = new Vector<>();
        
        int num = 0;
        int lastItem = 0;
        System.out.println("Por favor digite el número que desea agregar al array:");
        Scanner s = new Scanner(System.in);
        num = Integer.parseInt(s.nextLine());
        v.addElement(num);

        while (num != lastItem){
            System.out.println("Por favor digite el número que desea agregar al array:");
            num = Integer.parseInt(s.nextLine());
            lastItem = v.lastElement();
            v.addElement(num);
        }
        System.out.println(v);
    } 
             
}

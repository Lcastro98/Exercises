/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * La clase Main contiene el método para iniciar el programa.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Main {
    /**
     * Permite la interacción con el usuario para que este agregue las características de los vehículos deseados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehicle> VehicleList = new ArrayList<>();
        int add = 0;
        System.out.println("Bienvenido al sistema de control del Ferry. Por favor indique los datos de los vehiculos a transportar");
        do{
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la placa del vehículo");
        String plate = s.nextLine();
        System.out.println("Ingrese la fecha de matriculación del vehículo en el formato yyyy-MM-dd: ");
        String lD = s.nextLine();
        String[] l = lD.split("-");
        Calendar registrationDate = Calendar.getInstance();
        registrationDate.set(Integer.parseInt(l[0]),Integer.parseInt(l[1]), Integer.parseInt(l[2]));
        System.out.println("Ingrese el número de pasajeros del vehículo");
        int passengers = Integer.parseInt(s.nextLine());
        System.out.println("Si el vehículo tiene tripulación digite 1, de lo contrario digite 0");
        int crew = Integer.parseInt(s.nextLine());
        System.out.println("Indique la cantidad de ruedas del vehículo");
        int wheels = Integer.parseInt(s.nextLine());
        System.out.println("Indique el medio por el cual se desplaza el vehículo");
        String meansTransport = s.nextLine();
        System.out.println("Por favor, agregue el siguiente vehículo");
        
        Vehicle vh = new Vehicle(plate, registrationDate, passengers, (crew == 0?false:true), wheels, meansTransport) {};
        VehicleList.add(vh);
        
        add = add + 1;
        System.out.println(add);
        
        }
        while (add < 10);
        System.out.println(VehicleList);
    }
    
}

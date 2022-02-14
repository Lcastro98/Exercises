/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

import exercise4.Vehicle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

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
        ArrayList<Vehicle> VehicleList = new ArrayList<>();
        int add = 0;
        System.out.println("Bienvenido al sistema de control del Ferry.");
        do
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor digite el número que corresponde al tipo de vehículo que desea agregar. Las posibles opciones son:\n1. Car.\n2. Motorcycle.\n3. Truck.\n4. Bicycle.\n5. Boat");
            int Vehicle = Integer.parseInt(s.nextLine());
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
            
            switch(Vehicle){
                case 1 -> {
                    System.out.println("Si el carro tiene dos puertas digite 2, si tiene cuatro digite 4");
                    int doors= Integer.parseInt(s.nextLine());
                    
                    Car v = new Car((doors == 4?false:true), plate, registrationDate, passengers, (crew == 0?false:true), wheels, meansTransport);
                    VehicleList.add(v);
                }
                
                case 2 -> {
                    System.out.println("Si la moto tiene un motor de dos ciclos digite 2, si tiene un motor de cuatro ciclos digite 4");
                    int engineCycles= Integer.parseInt(s.nextLine());
                    
                    Motorcycle v = new Motorcycle((engineCycles == 4?false:true), plate, registrationDate, passengers, (crew == 0?false:true), wheels, meansTransport);
                    VehicleList.add(v);
                }
                
                case 3 -> {
                    System.out.println("Indique la altura del camión");
                    float height= Float.parseFloat(s.nextLine());
                    
                    Truck v = new Truck(height, plate, registrationDate, passengers, (crew == 0?false:true), wheels, meansTransport);
                    VehicleList.add(v);
                }
                    
                case 4 -> {
                    System.out.println("Indique el número de radios de la bicicleta: ");
                    int spokes= Integer.parseInt(s.nextLine());
                    
                    Bicycle v = new Bicycle(spokes, plate, registrationDate, passengers, (crew == 0?false:true), wheels, meansTransport);
                    VehicleList.add(v);
                }
                
                case 5 -> {
                    System.out.println("Si la lancha tiene motor digite 1, de lo contrario digite 0");
                    int engine= Integer.parseInt(s.nextLine());
                    
                    Boat v = new Boat((engine==0?false:true), plate, registrationDate, passengers, (crew == 0?false:true), wheels, meansTransport);
                    VehicleList.add(v);
                }
            }
            
            add = add + 1;
            System.out.println(add);
        
        }
        while (add < 10);
        System.out.println(VehicleList);
    }
    
}

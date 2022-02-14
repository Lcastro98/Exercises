/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5;

import exercise4.Vehicle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase Motorcycle define los atributos (caracteristicas) propios de la moto.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Motorcycle extends Vehicle {
    private boolean engineCycles;

    /**
     * Constructor: permite crear una instancia de la clase Motorcycle.
     * @param engineCycles
     * @param plate
     * @param registrationDate
     * @param passengers
     * @param crew
     * @param wheels
     * @param meansTransport 
     */
    public Motorcycle(boolean engineCycles, String plate, Calendar registrationDate, int passengers, boolean crew, int wheels, String meansTransport) {
        super(plate, registrationDate, passengers, crew, wheels, meansTransport);
        this.engineCycles = engineCycles;
    }

    /**
     * Método accesor del atributo engineCycles (cilindros del motor).
     * @return 
     */
    public boolean isEngineCycles() {
        return engineCycles;
    }

    /**
     * Método modificador del atributo engineCycles.
     * @param engineCycles 
     */
    public void setEngineCycles(boolean engineCycles) {
        this.engineCycles = engineCycles;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la nave de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(getRegistrationDate().getTime()); 
        return "\nInformación del vehiculo\nPlaca: " + getPlate() + "\nFecha de matriculación: " + strDate + "\nNúmero de pasajeros: " + getPassengers() + "\nTripulación: " + (isCrew()==true?"Presente":"Ausente") + "\nNúmero de ruedas: " + getWheels() + "\nMedio por el que se desplaza: " + getMeansTransport() + "Motor de: " + (isEngineCycles()==true?"2":"4") + "ciclos";
    } 
    
}

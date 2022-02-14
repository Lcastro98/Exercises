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
 *
 * @author lcast
 */
public class Bicycle extends Vehicle {
    private int spokes;

    public Bicycle(int spokes, String plate, Calendar registrationDate, int passengers, boolean crew, int wheels, String meansTransport) {
        super(plate, registrationDate, passengers, crew, wheels, meansTransport);
        this.spokes = spokes;
    }

    public int getSpokes() {
        return spokes;
    }

    public void setSpokes(int spokes) {
        this.spokes = spokes;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(getRegistrationDate().getTime()); 
        return "\nInformación del vehiculo\nPlaca: " + getPlate() + "\nFecha de matriculación: " + strDate + "\nNúmero de pasajeros: " + getPassengers() + "\nTripulación: " + (isCrew()==true?"Presente":"Ausente") + "\nNúmero de ruedas: " + getWheels() + "\nMedio por el que se desplaza: " + getMeansTransport() + "Número de radios: " + spokes;
    }
    
}

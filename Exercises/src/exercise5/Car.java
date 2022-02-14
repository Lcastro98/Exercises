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
public class Car extends Vehicle {
    private boolean doors;

    public Car(boolean doors, String plate, Calendar registrationDate, int passengers, boolean crew, int wheels, String meansTransport) {
        super(plate, registrationDate, passengers, crew, wheels, meansTransport);
        this.doors = doors;
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(getRegistrationDate().getTime()); 
        return "\nInformación del vehiculo\nPlaca: " + getPlate() + "\nFecha de matriculación: " + strDate + "\nNúmero de pasajeros: " + getPassengers() + "\nTripulación: " + (isCrew()==true?"Presente":"Ausente") + "\nNúmero de ruedas: " + getWheels() + "\nMedio por el que se desplaza: " + getMeansTransport() + "Cantidad de puertas: " + (isDoors()==true?"2":"4");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author lcast
 */
public class Vehicle {
    private String plate;
    private Calendar registrationDate;
    private int passengers;
    private boolean crew;
    private int wheels;
    private String meansTransport;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isCrew() {
        return crew;
    }

    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMeansTransport() {
        return meansTransport;
    }

    public void setMeansTransport(String meansTransport) {
        this.meansTransport = meansTransport;
    }

    public Vehicle(String plate, Calendar registrationDate, int passengers, boolean crew, int wheels, String meansTransport) {
        this.plate = plate;
        this.registrationDate = registrationDate;
        this.passengers = passengers;
        this.crew = crew;
        this.wheels = wheels;
        this.meansTransport = meansTransport;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(registrationDate.getTime()); 
        return "\nInformación del vehiculo\nPlaca: " + plate + "\nFecha de matriculación: " + strDate + "\nNúmero de pasajeros: " + passengers + "\nTripulación" + (crew==true?"Presente":"Ausente") + "\nNúmero de ruedas: " + wheels + "\nMedio por el que se desplaza: " + meansTransport + "\n";
    }


    
    
}

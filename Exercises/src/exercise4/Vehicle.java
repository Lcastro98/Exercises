/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * La clase Vehicle define los atributos (caracteristicas) que comparten los diferentes tipos de vehiculo.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public abstract class Vehicle {
    private String plate;
    private Calendar registrationDate;
    private int passengers;
    private boolean crew;
    private int wheels;
    private String meansTransport;
    
    
    /**
     * Constructor vacío
     */
    public Vehicle(){
    }
    
    /**
     * Constructor: permite crear una instancia de la clase Vehicle de acuerdo a los parametros estipulados.
     * 
     * @param plate
     * @param registrationDate
     * @param passengers
     * @param crew
     * @param wheels
     * @param meansTransport 
     */
    public Vehicle(String plate, Calendar registrationDate, int passengers, boolean crew, int wheels, String meansTransport) {
        this.plate = plate;
        this.registrationDate = registrationDate;
        this.passengers = passengers;
        this.crew = crew;
        this.wheels = wheels;
        this.meansTransport = meansTransport;
    }

    /**
     * Método accesor del atributo plate (placa del vehículo).
     * @return 
     */
    public String getPlate() {
        return plate;
    }

    /**
     * Método modificador del atributo plate.
     * @param plate 
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * Método accesor del atributo registrationDate (fecha de matriculación del vehículo).
     * @return 
     */
    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Método modificador del atributo registrationDate.
     * @param registrationDate 
     */
    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * Método accesor del atributo passengers (pasajeros).
     * @return 
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Método modificador del atributo passengers.
     * @param passengers 
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * Método accesor del atributo crew (presencia o ausencia de tripulación).
     * @return 
     */
    public boolean isCrew() {
        return crew;
    }

    /**
     * Método modificador del atributo crew.
     * @param crew 
     */
    public void setCrew(boolean crew) {
        this.crew = crew;
    }

    /**
     * Método accesor del atributo wheels (número de ruedas).
     * @return 
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Método modificador del atributo wheels.
     * @param wheels 
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Método accesor del atributo meansTransport (medio de desplazamiento).
     * @return 
     */
    public String getMeansTransport() {
        return meansTransport;
    }

    /**
     * Método modificador del atributp meansTransport
     * @param meansTransport 
     */
    public void setMeansTransport(String meansTransport) {
        this.meansTransport = meansTransport;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos del vehículo de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(registrationDate.getTime()); 
        return "\nInformación del vehiculo\nPlaca: " + plate + "\nFecha de matriculación: " + strDate + "\nNúmero de pasajeros: " + passengers + "\nTripulación" + (crew==true?"Presente":"Ausente") + "\nNúmero de ruedas: " + wheels + "\nMedio por el que se desplaza: " + meansTransport + "\n";
    }


    
    
}

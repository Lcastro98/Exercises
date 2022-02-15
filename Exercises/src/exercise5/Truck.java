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
 * La clase Truck define los atributos (caracteristicas) propios del camión.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Truck extends Vehicle {
    private float height;

    /**
     * Constructor: permite crear una instancia de la clase Truck.
     * @param height
     * @param plate
     * @param registrationDate
     * @param passengers
     * @param crew
     * @param wheels
     * @param meansTransport 
     */
    public Truck(
        float height, 
        String plate, 
        Calendar registrationDate, 
        int passengers, 
        boolean crew, 
        int wheels, 
        String meansTransport) 
    {
        super(plate, registrationDate, passengers, crew, wheels, meansTransport);
        this.height = height;
    }

    /**
     * Método accesor del atributo height (altura del camión).
     * @return 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Método modificador del atributo height.
     * @param height 
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Sobreescribe el método toString para mostrar los datos de la nave de la manera deseada.
     * @return 
     */
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(getRegistrationDate().getTime()); 
        return "\nInformación del vehiculo\nPlaca: " + getPlate() + "\nFecha de matriculación: " 
                + strDate + "\nNúmero de pasajeros: " + getPassengers() + "\nTripulación: " 
                + (isCrew()==true?"Presente":"Ausente") + "\nNúmero de ruedas: " + getWheels() 
                + "\nMedio por el que se desplaza: " + getMeansTransport() + "Altura delvehículo:" 
                + getHeight();
    } 
    
}

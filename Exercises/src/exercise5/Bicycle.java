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
 * La clase Bicycle define los atributos (caracteristicas) propios de la bicicleta.
 * 
 * @version 1.00.000 2022-02-14, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Bicycle extends Vehicle {
    private int spokes;

    /**
     * Constructor: permite crear una instancia de la clase Bicycle.
     * @param spokes
     * @param plate
     * @param registrationDate
     * @param passengers
     * @param crew
     * @param wheels
     * @param meansTransport 
     */
    public Bicycle(
        int spokes, 
        String plate, 
        Calendar registrationDate, 
        int passengers, 
        boolean crew, 
        int wheels, 
        String meansTransport) 
    {
        super(plate, registrationDate, passengers, crew, wheels, meansTransport);
        this.spokes = spokes;
    }

    /**
     * Método accesor del atributo spokes (radios de la bicicleta).
     * @return 
     */
    public int getSpokes() {
        return spokes;
    }

    /**
     * Método modificador del atributo spokes.
     * @param spokes 
     */
    public void setSpokes(int spokes) {
        this.spokes = spokes;
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
                + "\nMedio por el que se desplaza: " + getMeansTransport() + "Número de radios: " + spokes;
    }
    
}

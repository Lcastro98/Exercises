/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

/**
 * La clase Planet permite instanciar planetas y calcular la atracción gravitacional de dos planetas.
 * 
 * @version 1.00.000 2022-02-13, la clase corresponde a la versión 1 del sistema.
 * 
 * @author Lorena Castro - Lcastro0398@gmail.com
 */
public class Planet {
    private UUID id = UUID.randomUUID();
    private String name;
    private BigDecimal mass;
    private float diameter;
    private BigDecimal distanceSun;
    
    /**
     * Constructor: permite crear una instancia de la clase Planet.
     * @param name
     * @param mass
     * @param diameter
     * @param distanceSun 
     */
    public Planet(String name, BigDecimal mass, float diameter, BigDecimal distanceSun) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }

    /**
     * Método accesor del atributo id.
     * @return 
     */
    public UUID getId() {
        return id;
    }

    /**
     * Método accesor del atributo name.
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método modificador del atributo name.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método accesor del atributo mass (masa del planeta).
     * @return 
     */
    public BigDecimal getMass() {
        return mass;
    }

    /**
     * Método modificador del atributo mass.
     * @param mass 
     */
    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    /**
     * Método accesor del atributo diameter (diametro del planeta).
     * @return 
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * Método modificador del atributo diameter
     * @param diameter 
     */
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * Método accesor del atributo distanceSun (distancia del planeta al sol).
     * @return 
     */
    public BigDecimal getDistanceSun() {
        return distanceSun;
    }

    /**
     * Método accesor del atributo distanceSun.
     * @param distanceSun 
     */
    public void setDistanceSun(BigDecimal distanceSun) {
        this.distanceSun = distanceSun;
    }

    /**
     * Método para calcular la atracción gravitacional entre dos cuerpos.
     * Se debe escribir el nombre del método y entre parentesis los dos planetas para generar el calculo.
     * Se hace uso de la clase BigDecimal para hacer los calculos con los datos reales.
     * ej.:
     *      GravitationalAttraction(mercury, venus)
     * 
     * @param planet1
     * @param planet2
     * @return
     * 
     * @author Lorena Castro - Lcastro0398@gmail.com
     * 
     * @since 1.00.000
     */
    public static BigDecimal GravitationalAttraction(Planet planet1, Planet planet2) {
        BigDecimal G = new BigDecimal("6.67408E-11");
        BigDecimal m1 = planet1.getMass();
        BigDecimal m2 = planet2.getMass();
        BigDecimal d = planet1.getDistanceSun().subtract(planet2.getDistanceSun());
        
        BigDecimal F = G.multiply((m1.multiply(m2))).divide(d.pow(2), 2, RoundingMode.HALF_EVEN);
        return F;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Planet mercury = new Planet("Mercurio", new BigDecimal("3.302E23"), 4880, new BigDecimal("5.791E7"));
        Planet venus = new Planet("Venus", new BigDecimal("4.867E24"), 12104, new BigDecimal("1.082E8"));
        Planet earth = new Planet("Tierra", new BigDecimal("5.972E24"), 12756, new BigDecimal("1.496E8"));
        Planet mars = new Planet("Marte", new BigDecimal("6.39E23"), 6794, new BigDecimal("2.2794E8"));
        Planet jupiter = new Planet("Jupiter", new BigDecimal("1.899E27"), 142984, new BigDecimal("7.7833E8"));
        Planet saturn = new Planet("Saturno", new BigDecimal("5.683E26"), 108728, new BigDecimal("1.4294E9"));
        Planet uranus = new Planet("Urano", new BigDecimal("8.681E25"), 51118, new BigDecimal("2.87099E9"));
        Planet neptune = new Planet("Neptuno", new BigDecimal("1.024E26"), 49532, new BigDecimal("4.5043E9"));
        Planet pluto = new Planet("Plutón", new BigDecimal("1.29E22"), 2320, new BigDecimal("5.91352E9"));
        
        try {
            System.out.println("La atracción gravitacional de los dos planetas es: "
                    +GravitationalAttraction(mercury, venus)+ "N");
        } catch (RuntimeException e){
            System.out.println("No se pudo realizar el calculo, varificar nombre de los objetos");
        }
    }  
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

/**
 *
 * @author lcast
 */
public class Planet {
    private UUID id = UUID.randomUUID();
    private String name;
    private BigDecimal mass;
    private float diameter;
    private BigDecimal distanceSun;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public BigDecimal getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(BigDecimal distanceSun) {
        this.distanceSun = distanceSun;
    }

    public Planet(String name, BigDecimal mass, float diameter, BigDecimal distanceSun) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }

    public static BigDecimal GravitationalAttraction(Planet planet1, Planet planet2){
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
        
        System.out.println("La atracción gravitacional de los dos planetas es: "+GravitationalAttraction(mercury, venus)+ "N");
    }
    
}

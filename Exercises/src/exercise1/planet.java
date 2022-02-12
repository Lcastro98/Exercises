/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.util.UUID;

/**
 *
 * @author lcast
 */
public class planet {
    private UUID id;
    private String name;
    private float mass;
    private float diameter;
    private float distanceSun;
    private final double G = 0.0000000000667408;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(float distanceSun) {
        this.distanceSun = distanceSun;
    }

    public double getG() {
        return G;
    }

    public planet(UUID id, String name, float mass, float diameter, float distanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }
    

    
}

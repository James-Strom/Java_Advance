/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_example;

/**
 *
 * @author james
 */
public class Car extends Vehicle {
    private String colour;
    private int model;

    public Car(String name, String colour, String vehicleType, double price, int model) {
        super(name, vehicleType, price);
        this.model = model;
        this.colour = colour;
    }
    
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
    } 
}

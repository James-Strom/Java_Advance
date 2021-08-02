/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_example;


public class Vehicle {
    private String name;
    private String vehicleType; 
    private double price = 0.0;

    public Vehicle (String name, String vehicleType, double price ) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + vehicleType);
        System.out.println("Price: " + price);
    } 
}
        
    

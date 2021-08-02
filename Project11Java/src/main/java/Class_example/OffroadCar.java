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
public class OffroadCar extends Car{
    private boolean offRoad=true;
    
    public OffroadCar(String name, String colour, String vehicleType, double price, int model, boolean offRoad) {
        super(name, colour, vehicleType, price, model);
        this.offRoad = offRoad;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Offroad Worthy: " + offRoad);
    } 
}

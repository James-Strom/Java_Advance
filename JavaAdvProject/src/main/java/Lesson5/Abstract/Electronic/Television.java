/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.Abstract.Electronic;

public class Television extends ElectronicDevice {

    public void turnOn() {
        changeChannel(1);
        initializeScreen();
    }
    public void turnOff() {}
    
    public void changeChannel(int channel) {
        System.out.println("Channel Changed");
    }
    public void initializeScreen() {
        System.out.println("Tv turned on ...");
    }
}
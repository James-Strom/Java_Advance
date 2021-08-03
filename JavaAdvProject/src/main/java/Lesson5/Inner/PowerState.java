/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.Inner;

/**
 *
 * @author james
 */
public enum PowerState {
    OFF("The power is off"),
    ON("The usage power is high"),
    SUSPEND("The power usage is low");
    
    private String description;
    private PowerState(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }
    
}

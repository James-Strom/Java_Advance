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
public class Computer {

    PowerState crrSt;

    public void setState(PowerState state) {
        switch (state) {
            case OFF:
                this.crrSt = PowerState.OFF;
                break;
            case ON:
                this.crrSt = PowerState.ON;
                break;
            case SUSPEND:
                this.crrSt = PowerState.SUSPEND;
                break;
            default:
                System.out.println("State does not exist.");
        }
    }

    public PowerState getState() {
        return crrSt;
    }
}

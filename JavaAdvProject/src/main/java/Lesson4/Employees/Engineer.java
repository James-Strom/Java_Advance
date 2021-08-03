/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4.Employees;

public class Engineer extends Employee {

    private String technicalField;

    public String getTechnicalField() {
        return technicalField;
    }

    public void setTechField(String techField) {
        this.technicalField = techField;
    }

    public Engineer(int empId, String name, String ssn, double salary, String techField) {
        super(empId, name, ssn, salary);
        technicalField = techField;
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                + " Field: " + technicalField;
    }
}

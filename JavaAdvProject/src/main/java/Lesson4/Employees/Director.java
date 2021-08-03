/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4.Employees;

public class Director extends Manager {

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String deptName) {
        this.groupName = groupName;
    }

    public Director(int empId, String name, String ssn,
            double salary, String dept, String groupName) {
        super(empId, name, ssn, salary, dept);
        this.groupName = groupName;
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                + " Group: " + groupName;
    }
}

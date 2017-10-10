/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Gcobani Mkontwana
 */
public class Person1 extends Employee {
    private String physicalAddress;
    private double weeklySalary;
    public Person1(String firstName, String lastName, String gender, double weeklySalary) {
        super(firstName, lastName);
    }

    // rerturn address
    public String getPhysicalAddress() {
        return physicalAddress;
    }
        // set address
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }
    
    //return salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double salary) {
       weeklySalary = salary <0.0 ?0.0 :salary;
    }
    // additional information for sensibility of this sub-class
    
    public double earnings() {
        return getWeeklySalary();
    }
    
}

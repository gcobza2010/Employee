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
public class Person4 extends Person3 {
    private double baseSalary;

    public Person4(String firstName, String lastName, double rate, double sales) {
        super(firstName, lastName, rate, sales);
       // setBaseSalary(salary);
    }
    //return base salary

    public double getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(double salary) {
        baseSalary = (salary <0.0)?0.0 : salary;
    }
    //calculate earnings; override method earnings in // Person3
    
    public double earnings() {
    return getBaseSalary() + super.earnings();
    }
    public String toString()
     {
        return String.format( "%s %s; %s: $%,.2f",
           "base-salaried", super.toString(),
           "base salary", getBaseSalary() );
     }
}

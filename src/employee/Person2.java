/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Gcocbani Mkontwana
 */
public class Person2  extends Employee{
   private double wage;
   private double hours;
    public Person2(String firstName, String lastName, double hourlyWage) {
        super(firstName, lastName);
       
    }

    // returns hours worked
    public double getHours() {
        return hours;
    }

    // set hours
    public void setHours(double hoursWorked) {
        hours = ( ( hoursWorked >= 0.0 ) && (
                     hoursWorked <= 168.0 ) ) ?
          hoursWorked : 0.0;
    }

    // return wage
    public double getWage() {
        return wage;
    }

    // set wages
    public void setWage(double hourlyWage) {
        wage = (hourlyWage <0.0)?0.0: hourlyWage;
    }
    public String toString()
     {
       return String.format(
                       "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
           super.toString(), "hourly wage", getWage(),
           "hours worked", getHours() );
     }
}

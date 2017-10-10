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
public class Person3  extends Employee{
    private double grossSales;
    private double commisionRate;
    public Person3(String firstName, String lastName, double rate, double sales) {
        super(firstName, lastName);
        setGrossSale(sales);
        setCommissionRate(rate);
        
    }

    // set gross sales amount
    private void setGrossSale(double sales) {
       grossSales = (sales <0.0) ?0.0 :sales;
    }

    //set commision rate
    private void setCommissionRate(double rate) {
      commisionRate = (rate > 0.0 && rate < 1.0)? rate:0.0;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }
    // calculating earnings; override abstract method earnings in Employee.
    
    public double earnings() {
    return getCommisionRate() * getGrossSales();
    }
        public String toString()
     {
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
           "commission employee", super.toString(),
           "gross sales", getGrossSales(),
          "commission rate", getCommisionRate() );
      
     } // end method toString                         
    
}

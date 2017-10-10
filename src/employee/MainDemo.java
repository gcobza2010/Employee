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
public class MainDemo {
    
    
    public static void main(String args[]) {
    
        // sub-class objects
        
         Person2 person2 = new Person2("Chang", "Davidson", 800.00);
         Person3 person3 = new Person3("Mary", "Williams", 16.75, 40);
         Person4 person4 = new Person4("Alfonse", "Adrieka", 10000, 06);
    
         
         System.out.println( "Employees processed individually:\n" );
         System.out.printf("%s\\n%s: $%,.2f\\n\\n\"" , person2, "hours worked", person2.getHours());
         System.out.printf("%s\\n%s: $%,.2f\\n\\n\"" , person3, "earned", person3.earnings());
         System.out.printf("%s\\n%s: $%,.2f\\n\\n\"" , person4, "earned", person4.getBaseSalary());
    }
}

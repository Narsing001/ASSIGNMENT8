/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8q4;
import java.util.Scanner;

/**
 *
 * @author Narsing
 */
public class Employe {
    Scanner sc  = new Scanner(System.in); 
    int age;
    double salary;
    String name;
    public void getdata(){
       
         System.out.println("Enter the age ");
        age=sc.nextInt();
         System.out.println("Enter the salary ");
        salary=sc.nextDouble();
         System.out.println("Enter the name ");
        name=sc.next();
        
    }
    public void displaydata(){
        System.out.println("age="+age);
         System.out.println("Salary="+salary);
          System.out.println("name="+name);
         
    }
    
}

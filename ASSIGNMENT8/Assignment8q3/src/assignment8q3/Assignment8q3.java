/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8q3;
import java.util.Scanner;

/**
 *
 * @author Narsing
 */
public class Assignment8q3 {
    Scanner sc=new Scanner(System.in);
int age;
String sname;
double marks;
public void getdata(){
    System.out.println("Enter the age");
    age=sc.nextInt();
    System.out.println("Enter the student name");
    sname=sc.next();
   System.out.println("Enter the marks");
    marks=sc.nextDouble();
    
}
public void displaydeta(){
    System.out.println("age"+age);
    System.out.println("student name is"+sname);
    System.out.println("marks"+marks);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assignment8q3[] assignment=new Assignment8q3[5];
        for(int i=0;i<3;i++){
            System.out.println("Enter  student info");
            assignment[i]=new Assignment8q3();
            assignment[i].getdata();
        }
        for(int i=0;i<3;i++){
            System.out.println("This is student info");
            
           // assignment[i]=new Assignment8q3();
            assignment[i].displaydeta();
        }
        
    }
    
}

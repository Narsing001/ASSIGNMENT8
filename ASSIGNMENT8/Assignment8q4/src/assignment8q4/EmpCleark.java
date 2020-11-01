/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8q4;

/**
 *
 * @author Narsing
 */
public class EmpCleark extends Employe {
    int pcno;
    public void getinfo(){
        System.out.println("Enter pcno ");
        pcno=sc.nextInt();
        
    }
    public void displayinfo(){
        System.out.println("pcno is"+pcno); 
    }
     
    
    
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmet8q1;

/**
 *
 * @author Narsing
 */
public class Assignmet8q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Employe employe=new Employe();
       System.out.println("THIS EMPLOYE IS TRACHER..");
      EmpTeacher empteacher=new EmpTeacher();
      empteacher.getdata();
      empteacher.getdatails();
      empteacher.displaydata();
       empteacher.dispdetails();
       System.out.println("THIS EMPLOYE IS CLEARK..");
     EmpCleark empcleark=new EmpCleark();
     empcleark.getdata();
     empcleark.getinfo();
       empcleark.displaydata();
     empcleark.displayinfo();
      
    }
    
}

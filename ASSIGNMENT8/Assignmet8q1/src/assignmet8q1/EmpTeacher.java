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
public class EmpTeacher extends Employe  {
    String sub;
      public void getdatails(){
           System.out.println("Enter the sub ");
        sub=sc.next();

      }
      public void dispdetails(){
           System.out.println("sub is  "+sub);
        

      }
    
}

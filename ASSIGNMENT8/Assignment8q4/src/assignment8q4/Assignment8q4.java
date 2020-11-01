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
public class Assignment8q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        EmpTeacher[] empteacher=new EmpTeacher[3];
        for(int i=0;i<3;i++){
             System.out.println("This is Teacher deatils");
            empteacher[i]=new EmpTeacher();
             empteacher[i].getdata();
             empteacher[i].getdatails();
        }
         for(int i=0;i<3;i++){
                System.out.println("Teacher deatils");
            //empteacher[i]=new EmpTeacher();
             empteacher[i].displaydata();
             empteacher[i].dispdetails();
        }
          EmpCleark[] empcleark=new EmpCleark[3];
           for(int i=0;i<3;i++){
             System.out.println("This is cleark deatils");
            empcleark[i]=new EmpCleark();
             empcleark[i].getdata();
             empcleark[i].getinfo();
        }
           for(int i=0;i<3;i++){
             System.out.println("cleark deatils");
            empcleark[i]=new EmpCleark();
            empcleark[i].displaydata();
            empcleark[i].displayinfo();
        }

        
    }
    
}

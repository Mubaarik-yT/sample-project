

package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

   
    public static void main(String[] args) {
     System.out.println("hello mubarek");
     Scanner s=new Scanner(System.in);
     System.out.print("enter user name: ");
     String username=s.nextLine();
     System.out.println("enter a password");
     String h;
     int pass=s.nextInt ();
     
     if ( username.equals("gollis") && pass==125) {
         System.out.println(" welcome to the edpartment of c.technoloy");
    
         
         System.out.println("enter subject1 marks: ");
         double marks1=s.nextDouble();
              System.out.println("enter subject2 marks: ");
            double marks2=s.nextDouble(); 
            double percentage=(marks1+ marks2)/200 *100;
         System.out.println("subject1 marks is : " +marks1);
         System.out.print("your grade percentage is: ");
         System.out.println(percentage);
     }
     else if (username.equals("Ali") && pass==125 ){
         System.out.println("welcome to the department of c.technoloy");
    
         
         System.out.println("enter subject1 marks: ");
         double marks1=s.nextDouble();
              System.out.println("enter subject2 marks: ");
            double marks2=s.nextDouble(); 
            double percentage=(marks1+ marks2)/200 *100;
         System.out.println("subject1 marks is : " +marks1);
         System.out.print(" your grade percentage is: ");
         System.out.println(percentage);
     }
  
    else{
      System.out.println(" invalid username and password");
   
    }
    }
  
}

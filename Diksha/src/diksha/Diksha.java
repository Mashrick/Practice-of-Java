
//Leture 2 Homework 2


package diksha;

import java.util.*;


public class Diksha {

   
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        System.out.print("Enter Your Age: ");
        int age = SC.nextInt(); 
        
        System.out.print("Radius: ");
        float radius  = SC.nextFloat();      
        
        Double  area  =    Math.PI * Math.pow(radius, 2);
        
        System.out.println("Area of circle: "+area);        

        
    }
    
}

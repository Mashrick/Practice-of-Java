
//Leture 2 Homework 3

package diksha2;

import java.util.*;


public class Diksha2 {

   
    public static void main(String[] args) {
       Scanner SC = new Scanner(System.in);
       
       
       System.out.print("Enter a number: ");
       int number1 = SC.nextInt();
       
       for(int number2 = 1; number2 <= 10; number2++){
           
           int result = number1 * number2;
           
           System.out.println(number1 + ("*") + number2 + ("= ") + result);
           
       }
    }
    
}

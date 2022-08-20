
package diksha4;

import java.util.*;

public class Diksha4 {

    
    public static void main(String[] args) {
       Scanner SC = new Scanner(System.in);
       
       System.out.print("Enter a Number: ");
       int n= SC.nextInt();
       
       for(int i=1 ; i<=n; i++){
           
           for(int j=1; j<=n; j++){
               
               System.out.print("*");
               
           }
           
           System.out.println();
           
       }
            
    }
    
}

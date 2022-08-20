
//Leture 3 Homework 1

package diksha3;

import java.util.*;

public class Diksha3 {

    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter Number for a: ");
        float a = SC.nextInt();
        System.out.println("a= " + a);
        
        System.out.print("Enter Number for b: ");
        float b = SC.nextInt();
        System.out.println("b= " + b);
        
        float add = a+b;
        float sub = a-b;
        float multi = a*b;
        float div = a/b;
        
        
        
        System.out.print("If you want to Add PRESS: 1\nIf you want to Sub PRESS: 2\nIf you want to Multi PRESS: 3\nIf you want to Div PRESS: 4\n");
        int x = SC.nextInt();
        
        if(x ==1){
            
            System.out.println("Add Number: " + a + "+" + b +" ="+ add);  
            
        } else {
            if(x == 2){
                
                System.out.println("Sub Number: " + a + "-" + b +" ="+ sub);
            
            }
            if(x == 3){
                
                System.out.println("Multi Number: "+ a + "*" + b +" =" + multi);
            
            }
            if(x == 4){
                
                System.out.println("Div Number: " + a + "/" + b +" =" + div);
            
            }
        
        }            
        
    }
    
}

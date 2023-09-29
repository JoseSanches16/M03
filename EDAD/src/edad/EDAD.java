
package edad;
import java.util.Scanner;
public class EDAD {

   
    public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
     
     // variables 
     
     int edad;
        
     // para preguntar
        System.out.println(" Que edad tienes? ");
        
        edad = sc.nextInt();
     
        // true
      if (edad>= 18)
      {  System.out.println("eres mayor de edad");}
      
      // false
      else{
      System.out.println("eres menor de edad");}
         
        
        
    }
    
}


package ejercicio.pkg12;
import java.util.Scanner;

public class Ejercicio12 {

 
    public static void main(String[] args) {
        //scanner
       Scanner sc = new Scanner(System.in);
       int num1;  
       
       // pregunta
        System.out.println("ingrese un numero: ");
       num1 = sc.nextInt();
 //ver si el numero es positivo o negativo y considerando el 0 como positivo
                
        if (num1>=0) {
        
            System.out.println("El numero positivo. ");
        }
        
        else if  (num1<0){
            System.out.println("El numero es negativo. "); 
        }
      
         
               
    }
    
}

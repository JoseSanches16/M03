
package ejercicio.pkg12;
import java.util.Scanner;

public class Ejercicio12 {

 
    public static void main(String[] args) {
        //scanner
       Scanner sc = new Scanner(System.in);
         
       
       // pregunta
        System.out.println("ingrese un numero: ");
       double numero = sc.nextDouble();
 //ver si el numero es positivo o negativo y considerando el 0 como positivo
                
        if (numero>=0) {
        
            System.out.println("El numero positivo. ");
        }
        
        else {
            System.out.println("El numero es negativo. "); 
        }
      
    }
    
}

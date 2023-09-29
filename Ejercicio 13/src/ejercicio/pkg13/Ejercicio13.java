
package ejercicio.pkg13;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
   //scanner 
   
   Scanner sc = new Scanner(System.in);
   
        
   //ingrese el primer numero   
        System.out.println("ingrese el primer numero: ");
        double numero1 = sc.nextDouble();
        
        
       //ingrese el segundo numero     
        System.out.println("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();  
        
        
        //verificar los lados si son iguales 
        
        if (numero1 == numero2){
        
            System.out.println("Los numeros son iguales: " + numero1);
         }
        else if (numero1 < numero2)  {    
            System.out.println("Los numeros en orden ascendentes son : " + numero1 + "," + numero2 );
         }
        
        
        else  {  
            System.out.println("Los numeros en orden descendentes son : "+ numero2 + "," + numero1 );
           }
        
        
        
        
    }
    
}

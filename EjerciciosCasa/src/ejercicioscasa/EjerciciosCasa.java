package ejercicioscasa;
import java.util.Scanner;
public class EjerciciosCasa {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 

 final int PIN_CORRECTO = 1234;
        int intentos = 0;
        int pinIntroducido;

        

        while (true) {
            System.out.print("Ingresa el PIN: ");
            pinIntroducido = sc.nextInt();
            intentos++;

            if (pinIntroducido == PIN_CORRECTO || intentos > 3) {
                break; // Termina si el PIN es correcto o se superan 3 intentos
            } else {
     System.out.println("PIN incorrecto. Intentos restantes: " + (3 - intentos));
            }
        }

        if (pinIntroducido == PIN_CORRECTO) {
            System.out.println("PIN correcto. Acceso concedido.");
        } else {
            System.out.println("Se superaron los 3 intentos. Acceso denegado."); 
            
           } 
            
    
 /* while (true) {
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el anyo: ");
            int año = sc.nextInt();

            edad -= 1;
            año -= 1;

            System.out.println(edad + " - " + año);

            if (edad == 0) {
                System.out.println("Fin del programa.");
                break;
            }
        }    */   
 
 
  
 
    }  
}

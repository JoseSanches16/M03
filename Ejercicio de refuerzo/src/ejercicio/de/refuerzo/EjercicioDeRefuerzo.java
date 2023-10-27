package ejercicio.de.refuerzo;
import java.util.Scanner;
public class EjercicioDeRefuerzo {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);      
                
     int numero;

       do { //pas2 
            System.out.print("Ingresa un numero (0 para salir): ");
            numero = sc.nextInt();
    //detectar positivo
            if (numero > 0) {
                System.out.println("Es un numero positivo.");
            } else if (numero < 0) {
                //detectar negativo
                System.out.println("Es un numero negativo.");
            } else if (numero != 0) {
                System.out.println("Es cero (0).");
            }
        } while (numero != 0);

        System.out.println("Saliendo del programa.");

        
    }
    
}

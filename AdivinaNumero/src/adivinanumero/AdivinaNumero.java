package adivinanumero;
import java.util.Random;
import java.util.Scanner;
public class AdivinaNumero {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); 
        int intentos = 0;

        System.out.println(" un numero entre 0 y 100. Adivina cual es.");

        int suposicion;

        do {
            System.out.print("Ingresa tu suposicion: ");
            suposicion = sc.nextInt();
            intentos++;

            if (suposicion < numeroAleatorio) {
                System.out.println("El numero es mayor. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("El numero es menor. Intenta de nuevo.");
            }
        } while (suposicion != numeroAleatorio);

        System.out.println("Felicidades  Adivinaste el numero en " + intentos + " intentos.");
      
    }
    
}


package ejercicio.pkg2.clash.royale;
import java.util.Scanner;
public class Ejercicio2ClashRoyale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Ingresa la cantidad de copas que tienes: ");
        int copas = sc.nextInt();
        
          
        if (copas < 2000) {
            System.out.println(" Tienes menos de 2000 copas. Elige entre las siguientes cartas: ");
            System.out.println(" 0 - Mago Electrico ");
            System.out.println(" 1 - Esbirro Mega ");
        } else {
            System.out.println(" Tienes igual o mas de 2000 copas  Elige entre las siguientes cartas: ");
            System.out.println(" 0 - Caballero ");
            System.out.println(" 1 - Bandida ");
        }
          int eleccion = sc.nextInt();
    }
    
}

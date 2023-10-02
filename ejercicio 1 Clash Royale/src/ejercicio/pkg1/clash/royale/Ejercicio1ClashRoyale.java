
package ejercicio.pkg1.clash.royale;
import java.util.Scanner;

public class Ejercicio1ClashRoyale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
 System.out.println("Elige una carta:");
        System.out.println("0 - Mago Electrico");
        System.out.println("1 - Esbirro Mega");
        
        int eleccion = sc.nextInt();
        
        if (eleccion == 0) {
            System.out.println(" Has escogido Mago Electrico ");
        }
        
        
        
        else if (eleccion == 1) {          
         System.out.println(" Has escogido Esbirro Mega ");
        
        } 
        
        
        else  {
            System.out.println(" Opcion Esbirro ");
        }
    } 
}

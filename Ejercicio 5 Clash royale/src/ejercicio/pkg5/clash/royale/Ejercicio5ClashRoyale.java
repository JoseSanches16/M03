
package ejercicio.pkg5.clash.royale;
import java.util.Scanner;
public class Ejercicio5ClashRoyale {

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
       
        if (copas > 3000)
        {
            System.out.println(" Tienes igual o mas de 3000 copas Elige entre las siguientes cartas : ");
            System.out.println(" 0 - Ejercito de esqueleto ");
            System.out.println("1 - Gigante noble  ");
        }
     
        else {
            System.out.println(" Tienes menos de 3000 copas Elige entre las siguientes cartas : "); 
             
            System.out.println(" 0 - Caballero ");
            
            System.out.println(" 1 - Bandida ");
        }   
        
        int elige = sc.nextInt();
    }
}

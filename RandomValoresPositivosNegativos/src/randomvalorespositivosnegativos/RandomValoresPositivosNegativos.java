
package randomvalorespositivosnegativos;
import java.util.Scanner;
public class RandomValoresPositivosNegativos {

    public static void main(String[] args) {
/* int max =201;
    int min =1;
    int range = max - min +1;
    int num_correcte;
    int mayor=5;
        for (int i = 0; i < 10; i++) {
           
         num_correcte = (int)(Math.random()*range) + min - (mayor+1);
            System.out.println("num_corercte");
            }   */
    
    
 Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("**** Bienvenido a FIFA ****");
            System.out.println("*   A - Jugar              *");
            System.out.println("*   B - Entrenar           *");
            System.out.println("*   C - Jugar Partido Online *");
            System.out.println("*   D - Salir              *");
            System.out.print("Escoge Opcion: ");
            
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case 'A':
                    case 'a':
                    System.out.println("Estas jugando.");
                    break;
                case 'B':
                    case 'b':
                    System.out.println("Estas entrenando.");
                    break;
                case 'C':
                    case 'c':
                    System.out.println("Estas jugando un partido en linea.");
                    break;
                case 'D':
                    case 'd':
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige A, B, C o D.");
            }
        } while (opcion != 'D' && opcion!='d');
    
    
    
    }
    
}

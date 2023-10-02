
package clase;
import java.util.Scanner;
public class CLASE {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad;
        char clase;      //esto es para caracteres
         System.out.println("A que clase vas?");
         clase = sc.next() .charAt(0);   // para recoger una caracter
         System.out.println("vas al grupo " + clase);
         System.out.println("Que edad tienes?");
         edad = sc.nextInt();
         System.out.println("Tienes" + edad + "años" );
        
        
        if (clase=='A' && edad>=18)
        {
            System.out.println("vas a la clase correcta" + clase);
        }
            
        else if (( clase=='B' || clase=='C' ) && edad < 18 )     // or es ||
        {
            System.out.println("vas a la clase correcta" + clase);
            
        }
            
            
            
            
        }
        
    }
        
    
    
    
    
    
   
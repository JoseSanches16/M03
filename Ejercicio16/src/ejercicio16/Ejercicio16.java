
package ejercicio16;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

double  nota;
        System.out.println("Que nota has sacado ");
 nota = sc.nextDouble();
 
 if (nota>=0  && nota<3 )   
 {   
     System.out.println("Muy deficiente");
 }

 else if (nota>=3 && nota <5 )
 {System.out.println("Deficiente");
 }

 else if ( nota>=5 && nota <6 )
 {
     System.out.println("Bien");
 }   
 
 else if ( nota>=6 && nota <9)
 {
     System.out.println("notable");
 }
    
 else if ( nota>=9 && nota <=10 )
 {
     System.out.println("excelente");
 }
    
    }
    
}
    



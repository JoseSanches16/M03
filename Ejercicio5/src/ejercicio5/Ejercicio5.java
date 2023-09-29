
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
  
    public static void main(String[] args) {
 // Declarar variables
 double radio , diametro,longitud,area;
 double pi=3.14
         
      Scanner sc = new Scanner(System.in);
        System.out.println("pon el radio de circunferencia");
        
        radio = sc.nextDouble();
        diametro = radio * 2;
        longuitud = pi * diametro;
        System.out.println("la longuitud de circunferencia de radio" + radio + "es" + longitud);
        
      area=pi *radio * radio; //pi * radio x2  
        
        System.out.println("la area de circunferencia de radio" + radio + "es" + area );
        
        
    }
    
}

package ejercicio.de.practica1;
import java.util.Scanner;
public class EjercicioDePractica1 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        
 
 
   int num;
   int cont ;
   boolean negativo=false;
  
   for (cont= 1 ; cont<=10; cont++)
   {
       System.out.println("Pon numero");
    }
   num = sc.nextInt();
   if (num<0)
   {
   negativo = true;
       System.out.println("Negativo");
   
   }
   
   if (negativo==true)
       
   {
       System.out.println("has introducido un valor negativo");
   
   }
   
        System.out.println("no has puestos negativos");
   
   
   
   
   
   
   
   
   
   
   
   
        
        
        
    } 
}

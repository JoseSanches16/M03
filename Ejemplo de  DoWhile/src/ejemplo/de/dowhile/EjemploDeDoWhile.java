package ejemplo.de.dowhile;
import java.util.Scanner;
public class EjemploDeDoWhile {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      
      
      int cont=1;
      
      do {
          System.out.println("Contador -->" + cont);
      ++cont;
      
      }
   
        while(cont<10);
        System.out.println("Final");        
        
        
    
        
    }
    
}

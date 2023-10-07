package ejemplo.pkg2.de.dowhile;
import java.util.Scanner;
public class Ejemplo2DeDoWhile {

    public static void main(String[] args) {
     int num;
     Scanner sc = new Scanner (System.in);
   do
   {
        System.out.println("Pon valores , (-1 para terminar )");
        num = sc.nextInt();
        System.out.println("Has introducido el " + num);           
  
  
      } 
   while (num!=1);
        System.out.println("Mismo bucle  pero con variables boolean");

        
        boolean end = false;
        
     
        do {
            System.out.println("Pon valores , (-1 para terminar ");     
            num = sc.nextInt();
            if (num==-1)
            {
                System.out.println("activado");
               end = true;
            
            } 
        } while ( end==false);
        
        
        
        
}  
    
}

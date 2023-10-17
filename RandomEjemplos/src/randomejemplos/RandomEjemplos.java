
package randomejemplos;
import java.util.Random;
import java.util.Scanner;
public class RandomEjemplos {
    public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  
        System.out.println("voy a generar un numero aleatorio del 1 al 100");
      
       int max=10;
       int min=1;
         int range = max - min + 1 ;
         System.out.println("valor maximo"+ max);
           System.out.println("valor min"+ min);      
                   System.out.println("valor range"+ range) ;
     
      int aleatorio= (int) (Math.random()*range) + min;
      
      System.out.println("numero generado -->"+ aleatorio);
    
    
    
      
      
      
    Random rd =new Random();
    min=1;
    range = 10;
    aleatorio= rd.nextInt(range)+min;
        System.out.println("numero generado por random -->" + aleatorio);
    
     
    
    }
    
}


package randomutilidades;
import java.util.Scanner;
public class RandomUtilidades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        /*   int num_usuari, intentos=0;
        int  max=2;
        int min =1;
        int range =max - min + 1;
       int numero_correcte;
        int cont_creus=0;
        
        do{
            numero_correcte = (int)(Math.random()*range) + min;
              
        if (numero_correcte==1)  
        {
            System.out.println("cara");
        }
  
       else {
        
            System.out.println("creu");
        }        
        }  while (cont_creus<3);   
        
        */
        
    
    
        int num_usuari, intentos=0;
        int  max=2;
        int min =1;
        int range =max - min + 1;
       int numero_correcte;
        int cont_creus=0;
   
        int contador;
        int normal=0,rara=0,epica=0;
        
        
        for (contador = 1;  contador< 100; contador++) {
            numero_correcte = (int)(Math.random()*range) + min; 
          if (numero_correcte>=1 && numero_correcte<=60){
              System.out.println("cajas nromal");
          normal++;    
          }
       }
        
        
        
        
        
        
        
        
        
    
        
        
        
        
    }
    
}

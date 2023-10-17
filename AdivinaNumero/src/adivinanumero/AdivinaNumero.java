package adivinanumero;
import java.util.Random;
import java.util.Scanner;
public class AdivinaNumero {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        Random random = new Random();
     int num_usuari, intentos=0;
        int max = 20;
        int min = 1;
        int range = max - min + 1;  
        int numero_correcte = (int)(Math.random()*range) + min;
        System.out.println("He pensat el " + numero_correcte);

         do{
           
            System.out.println("Pon un valor del " + min + " al " + max);
            num_usuari = sc.nextInt();
            intentos++;
            if (num_usuari>numero_correcte)
            {
                System.out.println("tu numero es mayor");
            }
            else if (num_usuari<numero_correcte)
            {
                System.out.println("tu numero es menor");
            }
            
            if (intentos>=3)
            {
            break;
            }
            
//            else
//            {
//                System.out.println("Es correcto");
//            }
        }while(num_usuari!=numero_correcte  && intentos<3);
   //negar las condiciones    (num_usuari = num_correcte  || intentos>=3);
        
   if (intentos>=3){
    
        System.out.println("has perdido");
    }

   
   else {
   
      System.out.println("Es correcto has tardado " + intentos + " intentos .... ");
   }
    
    }
    }
    


package ejercicio.pkg11;
import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  //variables
 
    double num1,num2;
    
    // pregunta
    
        System.out.println(" pon valor 1 ");
        num1=sc.nextDouble();
        System.out.println(" pon valor 2 ");
        num2=sc.nextDouble();
        
        
        System.out.println(" num1 ");
        System.out.println(" num2 ");
        
        
        if (num1==num2){
            System.out.println(" son iguales los valores ");
        }
        
        
        else  if (num1>num2) //false
        { //true
           // System.out.println(" numero 1 es mas grande que numero 2 ");
            System.out.println(num1 + "superior a" + num2); } 
            
            else if (num2>num1) {
            
             System.out.println( num2 + "es superior a " + num1);
                    }
        
            
        }
    
    
    
    
    
    
    
    
    
    }
    
}

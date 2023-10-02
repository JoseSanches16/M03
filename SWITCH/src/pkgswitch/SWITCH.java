package pkgswitch;
import java.util.Scanner;
public class SWITCH {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 char mes ;
 
        System.out.println("Introdcue una de las siguientes letras  E,F,M,A,Z ");
        mes = sc.next().charAt(0);
        
        switch (mes) {
        
        case 'E' : 
                System.out.println("Enero ");
        break;
        
        
        case 'F' : 
                System.out.println("Febrero");
        break;
        
        
        
        
        case 'M' : 
                System.out.println("Marzo");
        break;
        
        
        case 'A' : 
                System.out.println("Abril ");
        break;
        
         case 'Z' : 
                System.out.println("Agosto ");
        break;
        
        
        default:
                System.out.println("Letra no valido");
        break;
       
        
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}

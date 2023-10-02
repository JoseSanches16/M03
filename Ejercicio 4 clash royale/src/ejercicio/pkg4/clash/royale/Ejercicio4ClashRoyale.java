
package ejercicio.pkg4.clash.royale;
import  java.util.Scanner;

public class Ejercicio4ClashRoyale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
          int  copas; //  para numeros enteros 
    char cartas; //  char  un caracter
    
    
        System.out.println("cuantass copas tienes? ");
     copas=sc.nextInt();
     
     
    
    
    if ( copas >=0  &&  copas <2000){
    
        System.out.println(" que carta eliges Mago electrico (m) o Mega esbirro (e)   :");
        cartas = sc.next().charAt(0); // para un  caracter 
        // cuando es numero entero pongo sc.int
        
        if (cartas == 'm' ){
        
            System.out.println("has elegido el mago electrico ");
            
        }
        
        
        else if (cartas == 'e'){
            System.out.println("has elegido el mega esbirro ");        
        
        }
        
       
        else {
        
            System.out.println("carta incorrecta");
        }
              }
 
    
      
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
